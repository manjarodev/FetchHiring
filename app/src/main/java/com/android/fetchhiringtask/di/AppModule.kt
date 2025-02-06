package com.android.fetchhiringtask.di

import com.android.fetchhiringtask.data.cloud.ApiService
import com.android.fetchhiringtask.data.cloud.HiringRemoteDataSource
import com.android.fetchhiringtask.data.repository.HiringRepository
import com.android.fetchhiringtask.data.usecase.GetHiringDataUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


const val SERVICE_BASE = "https://fetch-hiring.s3.amazonaws.com/"

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideApiService(): ApiService {
        return Retrofit.Builder()
            .baseUrl(SERVICE_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }

    @Provides
    fun provideUserRemoteDataSource(apiService: ApiService): HiringRemoteDataSource {
        return HiringRemoteDataSource(apiService)
    }

    @Provides
    fun provideUserRepository(hiringRemoteDataSource: HiringRemoteDataSource): HiringRepository {
        return HiringRepository(hiringRemoteDataSource)
    }

    @Provides
    fun provideGetUserDataUseCase(hiringRepository: HiringRepository): GetHiringDataUseCase {
        return GetHiringDataUseCase(hiringRepository)
    }
}
