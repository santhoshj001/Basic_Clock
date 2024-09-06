package com.teamb.sjdroidclock.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.teamb.sjdroidclock.viewmodel.ClockViewModel

@Composable
fun TimeView(clock: ClockViewModel = viewModel(), lifecycleOwner: LifecycleOwner) {


    val timeString by clock.time.collectAsStateWithLifecycle()

    /* LaunchedEffect(lifecycleOwner) {
         lifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
             clock.time.collectLatest { clockTime ->
                 Log.d("Time collected in UI : ", clockTime)
                 timeString = clockTime
             }
         }
     }*/


    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = timeString, modifier = Modifier.align(Alignment.Center))
    }
}