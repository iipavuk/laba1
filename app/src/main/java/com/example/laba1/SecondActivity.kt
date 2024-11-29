package com.example.laba1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import com.example.laba1.ui.theme.Laba1Theme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laba1Theme {
        val parameter = intent.getStringExtra("PARAMETER")  ?: "Нет данных"

        DisplayParameter(parameter)
                }
            }
        }
    }


@Composable
fun DisplayParameter(parameter: String) {
    Text(text = "Переданный параметр: $parameter")
}

