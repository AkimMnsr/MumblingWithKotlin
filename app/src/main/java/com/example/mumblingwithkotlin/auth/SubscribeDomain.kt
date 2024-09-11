package com.example.mumblingwithkotlin.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mumblingwithkotlin.templates.SubscribePage

class SubscribeDomain: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SubscribePage()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SubscribePreview(){
    SubscribePage()
}





