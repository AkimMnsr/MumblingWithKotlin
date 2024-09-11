package com.example.mumblingwithkotlin.component

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.unit.dp


@Composable
fun TextFieldComponent(label: String){
    TextField(
        modifier = Modifier.padding(0.dp, 10.dp).fillMaxWidth(),
        value = "", onValueChange = {},
        label = { Text(text = label, style = TextStyle(Color.White)) },
        shape = RoundedCornerShape(40.dp),
        colors = TextFieldDefaults.colors(
            unfocusedIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedContainerColor = Color(0x44000000)
        )

        )

}