package com.android.fetchhiringtask.data.cloud

import com.android.fetchhiringtask.data.models.HiringDto
import javax.inject.Inject


class HiringRemoteDataSource @Inject constructor(private val apiService: ApiService) {
    suspend fun fetchUserData(): List<HiringDto> {
        return apiService.fetchHiringList()
    }
}