package com.example.instragramcomposeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.instragramcomposeui.ui.theme.InstragramComposeUiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstragramComposeUiTheme {
                ProfileScreen()
            }
        }
    }
}