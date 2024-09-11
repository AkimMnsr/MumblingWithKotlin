package com.example.mumblingwithkotlin.auth

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mumblingwithkotlin.templates.LoginPage
import kotlin.reflect.KClass

class Connection: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginPage({ nav(Subscribe::class) }, { nav(LostPassword::class) })
        }
    }
    private fun <T: Any> nav(page:  KClass<T>){
        val intent = Intent(this, page.java)
        startActivity(intent)
    }
}

@Preview(showBackground = true)
@Composable
fun ConnectionPreview(){
    LoginPage()
}

