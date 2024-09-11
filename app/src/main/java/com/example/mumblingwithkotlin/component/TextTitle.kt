package com.example.mumblingwithkotlin.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun TextTitleComponent(label: String){
    Text(text = label, style = TextStyle(
        color = Color.White,
        fontSize = 38.sp

    )
    )
}