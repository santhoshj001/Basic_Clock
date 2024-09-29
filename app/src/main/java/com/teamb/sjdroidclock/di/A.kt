package com.teamb.sjdroidclock.di


import com.teamb.sjdroidclock.data.repository.TimeRepositoryImpl
import com.teamb.sjdroidclock.domain.repository.TimeRepository
import com.teamb.sjdroidclock.domain.usecase.GetTimeUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTimeRepository(): TimeRepository = TimeRepositoryImpl()

    @Provides
    @Singleton
    fun provideGetTimeUseCase(timeRepository: TimeRepository): GetTimeUseCase {
        return GetTimeUseCase(timeRepository)
    }
}