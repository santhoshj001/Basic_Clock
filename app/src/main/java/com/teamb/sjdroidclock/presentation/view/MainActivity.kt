package com.teamb.sjdroidclock.presentation.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.teamb.sjdroidclock.presentation.component.TimeView
import com.teamb.sjdroidclock.ui.theme.SjdroidClockTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SjdroidClockTheme {
                TimeView()
            }
        }
    }
}