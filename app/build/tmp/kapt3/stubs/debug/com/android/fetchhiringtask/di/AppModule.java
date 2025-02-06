package com.android.fetchhiringtask.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/android/fetchhiringtask/di/AppModule;", "", "()V", "provideApiService", "Lcom/android/fetchhiringtask/data/cloud/ApiService;", "provideGetUserDataUseCase", "Lcom/android/fetchhiringtask/data/usecase/GetHiringDataUseCase;", "hiringRepository", "Lcom/android/fetchhiringtask/data/repository/HiringRepository;", "provideUserRemoteDataSource", "Lcom/android/fetchhiringtask/data/cloud/HiringRemoteDataSource;", "apiService", "provideUserRepository", "hiringRemoteDataSource", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.android.fetchhiringtask.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.android.fetchhiringtask.data.cloud.ApiService provideApiService() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.android.fetchhiringtask.data.cloud.HiringRemoteDataSource provideUserRemoteDataSource(@org.jetbrains.annotations.NotNull
    com.android.fetchhiringtask.data.cloud.ApiService apiService) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.android.fetchhiringtask.data.repository.HiringRepository provideUserRepository(@org.jetbrains.annotations.NotNull
    com.android.fetchhiringtask.data.cloud.HiringRemoteDataSource hiringRemoteDataSource) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.android.fetchhiringtask.data.usecase.GetHiringDataUseCase provideGetUserDataUseCase(@org.jetbrains.annotations.NotNull
    com.android.fetchhiringtask.data.repository.HiringRepository hiringRepository) {
        return null;
    }
}