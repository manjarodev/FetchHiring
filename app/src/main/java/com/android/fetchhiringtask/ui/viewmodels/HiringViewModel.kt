package com.android.fetchhiringtask.ui.viewmodels


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.fetchhiringtask.data.models.HiringDto
import com.android.fetchhiringtask.data.usecase.GetHiringDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HiringViewModel @Inject constructor(
    private val getHiringDataUseCase: GetHiringDataUseCase
) : ViewModel() {

    private val _hiringList = MutableStateFlow<List<HiringDto>>(emptyList())
    val hiringList: StateFlow<List<HiringDto>> = _hiringList

    init {
        fetchHiringList()
    }

    fun fetchHiringList() {
        viewModelScope.launch {
            val response = getHiringDataUseCase.execute()

            val filteredSortedUsers = response
                .filter { !it.name.isNullOrBlank() }
                .sortedWith(compareBy({ it.listId }, { it.name }))
            val groupedUsers = filteredSortedUsers.groupBy { it.listId }
            val sortedGroupedUsers = groupedUsers.toSortedMap().flatMap { it.value }


            _hiringList.value = sortedGroupedUsers
        }
    }
}
