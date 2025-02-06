package com.android.fetchhiringtask.data.repository

import com.android.fetchhiringtask.data.models.HiringDto
import com.android.fetchhiringtask.data.cloud.HiringRemoteDataSource
import javax.inject.Inject

class HiringRepository @Inject constructor(private val hiringRemoteDataSource: HiringRemoteDataSource) {

    suspend fun getHiringData(): List<HiringDto> {
        return hiringRemoteDataSource.fetchUserData()
    }
}
