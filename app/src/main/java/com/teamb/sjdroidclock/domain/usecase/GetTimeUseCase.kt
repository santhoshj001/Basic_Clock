package com.teamb.sjdroidclock.domain.usecase

import com.teamb.sjdroidclock.domain.model.Time
import com.teamb.sjdroidclock.domain.repository.TimeRepository
import kotlinx.coroutines.flow.Flow

class GetTimeUseCase(private  val timeRepository: TimeRepository) {
    fun execute(): Flow<Time> {
        return timeRepository.getCurrentTime()
    }
}