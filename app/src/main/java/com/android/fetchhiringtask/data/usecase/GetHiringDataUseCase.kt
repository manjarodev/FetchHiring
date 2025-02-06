package com.android.fetchhiringtask.data.usecase

import com.android.fetchhiringtask.data.models.HiringDto
import com.android.fetchhiringtask.data.repository.HiringRepository
import javax.inject.Inject

class GetHiringDataUseCase @Inject constructor(private val hiringRepository: HiringRepository) {

    suspend fun execute(): List<HiringDto> {
        return hiringRepository.getHiringData()
    }

}
