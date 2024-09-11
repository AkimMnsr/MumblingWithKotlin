package com.example.mumblingwithkotlin.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun TextCardComponent(inputs: String, isTitle: Boolean){
    if (isTitle) {
        return Text(
            text = inputs,
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
        )
    }
    return Text(
        text = inputs,
        color = Color.White,
        modifier = Modifier
            .fillMaxWidth()
    )
}