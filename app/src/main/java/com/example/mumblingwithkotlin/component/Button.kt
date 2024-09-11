package com.example.mumblingwithkotlin.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mumblingwithkotlin.ui.theme.borderBouttonColor
import com.example.mumblingwithkotlin.ui.theme.bouttonColor


@Composable
fun ButtonComponent(label: String, nav: () -> Unit = {}){
    Button(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 10.dp).clip(RoundedCornerShape(40.dp)),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        onClick = {nav()},
        contentPadding = PaddingValues(),
        border = BorderStroke(1.dp, borderBouttonColor)
    ) {
        Box(
            modifier = Modifier.background(bouttonColor)
            .fillMaxWidth()
            .padding(vertical = 15.dp),
            contentAlignment = Alignment.Center) {
            Text(
                text = label,
                style = TextStyle(
                    color = Color.White,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp
                )
            )
        }

    }
}