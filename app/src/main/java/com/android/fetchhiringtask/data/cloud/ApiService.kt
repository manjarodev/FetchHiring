package com.android.fetchhiringtask.data.cloud

import com.android.fetchhiringtask.data.models.HiringDto
import retrofit2.http.GET


interface ApiService {

    @GET("hiring.json")
    suspend fun fetchHiringList(): List<HiringDto>

}