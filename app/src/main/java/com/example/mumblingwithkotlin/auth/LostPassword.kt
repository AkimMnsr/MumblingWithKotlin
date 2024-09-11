package com.example.mumblingwithkotlin.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mumblingwithkotlin.templates.LostPasswordPage

class LostPassword: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LostPasswordPage()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LostPasswordPreview(){
    LostPasswordPage()
}
