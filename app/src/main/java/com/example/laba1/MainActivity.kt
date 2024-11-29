package com.example.laba1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.laba1.ui.theme.Laba1Theme
import androidx.compose.ui.Alignment


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Laba1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(modifier = Modifier.padding(innerPadding), onNavigateToSecondActivity = {

                        val intent = Intent(this, SecondActivity::class.java)
                        intent.putExtra("PARAMETER", "Торопчина")
                        startActivity(intent)
                    })
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier, onNavigateToSecondActivity: () -> Unit) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Text(text = "Hello WOrld")
        Button(onClick = onNavigateToSecondActivity) {
            Text(text = "Переход на 2ой экран")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Laba1Theme {
        MainScreen(onNavigateToSecondActivity = {})
    }
}