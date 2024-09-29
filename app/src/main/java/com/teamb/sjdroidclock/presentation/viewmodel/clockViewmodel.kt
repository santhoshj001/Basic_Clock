package com.teamb.sjdroidclock.presentation.viewmodel


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.teamb.sjdroidclock.domain.model.Time
import com.teamb.sjdroidclock.domain.usecase.GetTimeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class ClockViewModel @Inject constructor(
    private val getTimeUseCase: GetTimeUseCase
) : ViewModel() {
    val time: StateFlow<Time> = getTimeUseCase.execute().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(500),
        Time("00:00:00")
    )
}