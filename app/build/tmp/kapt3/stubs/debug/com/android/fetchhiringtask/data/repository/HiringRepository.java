package com.android.fetchhiringtask.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/android/fetchhiringtask/data/repository/HiringRepository;", "", "hiringRemoteDataSource", "Lcom/android/fetchhiringtask/data/cloud/HiringRemoteDataSource;", "(Lcom/android/fetchhiringtask/data/cloud/HiringRemoteDataSource;)V", "getHiringData", "", "Lcom/android/fetchhiringtask/data/models/HiringDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class HiringRepository {
    @org.jetbrains.annotations.NotNull
    private final com.android.fetchhiringtask.data.cloud.HiringRemoteDataSource hiringRemoteDataSource = null;
    
    @javax.inject.Inject
    public HiringRepository(@org.jetbrains.annotations.NotNull
    com.android.fetchhiringtask.data.cloud.HiringRemoteDataSource hiringRemoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getHiringData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.android.fetchhiringtask.data.models.HiringDto>> $completion) {
        return null;
    }
}