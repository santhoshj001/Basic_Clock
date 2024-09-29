package com.teamb.sjdroidclock.presentation.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.teamb.sjdroidclock.presentation.viewmodel.ClockViewModel

@Composable
fun TimeView(clock: ClockViewModel = viewModel()) {
    val timeString by clock.time.collectAsStateWithLifecycle()

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = timeString.formattedTime, modifier = Modifier.align(Alignment.Center))
    }
}