package com.teamb.sjdroidclock.data.repository

import com.teamb.sjdroidclock.domain.model.Time
import com.teamb.sjdroidclock.domain.repository.TimeRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class TimeRepositoryImpl: TimeRepository {
    override fun getCurrentTime(): Flow<Time> {
        return flow {
            while (true) {
                emit(Time(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))))
                delay(1000)
            }
        }
    }
}