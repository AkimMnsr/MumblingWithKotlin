package com.example.mumblingwithkotlin.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.mumblingwithkotlin.bo.Article

@Composable
fun TextCard(article: Article) {
    Column(
        modifier = Modifier
            .background(color = Color(0x55000000))
            .fillMaxWidth()
            .padding(10.dp),
        verticalArrangement = Arrangement.Bottom
    ) {
        TextCardComponent(article.title, true)
        Spacer(modifier = Modifier.padding(vertical = 5.dp))
        TextCardComponent(article.Description, false)
    }
}