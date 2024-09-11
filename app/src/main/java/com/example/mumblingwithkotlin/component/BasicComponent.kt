package com.example.mumblingwithkotlin.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.mumblingwithkotlin.ui.theme.MumblingWithKotlinTheme

@Composable
fun BasicComponent(component: @Composable () -> Unit){
    MumblingWithKotlinTheme{
        Scaffold(modifier = Modifier.fillMaxSize()){
                innerPadding ->
            Box(modifier = Modifier.padding(innerPadding)){
                BackgroundComponent()
                component()
            }
        }
    }
}