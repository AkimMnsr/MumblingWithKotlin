package com.example.mumblingwithkotlin.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.mumblingwithkotlin.R

@Composable
fun BackgroundComponent(){
    Image(
        painter = painterResource(id = R.drawable.background_app),
        contentDescription = "background",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize()
    )
}