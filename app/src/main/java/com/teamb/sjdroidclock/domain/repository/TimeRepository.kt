package com.teamb.sjdroidclock.domain.repository

import com.teamb.sjdroidclock.domain.model.Time
import kotlinx.coroutines.flow.Flow

interface TimeRepository {
    fun getCurrentTime(): Flow<Time>
}