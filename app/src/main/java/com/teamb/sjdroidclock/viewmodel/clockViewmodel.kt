package com.teamb.sjdroidclock.viewmodel


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


class ClockViewModel : ViewModel() {

    private val _time: Flow<String> = flow {
        val formatter = DateTimeFormatter.ofPattern("hh:mm:ss")
        while (true) {
            val time = LocalDateTime.now().format(formatter)
            emit(time)
            delay(1000)
        }
    }
    val time: StateFlow<String> = _time.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(500),
        "00:00:00"
    )
}