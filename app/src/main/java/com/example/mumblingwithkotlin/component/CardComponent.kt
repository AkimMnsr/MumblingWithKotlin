package com.example.mumblingwithkotlin.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.mumblingwithkotlin.bo.Article

@Composable
fun ArticleComponent(articles: List<Article>) {
    Column(
        modifier = Modifier
            .padding(40.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextTitleComponent(label = "Articles")
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp)
        ) {
            items(articles) { article ->
                CardComponent(article)
            }
        }
    }

}

@Composable
fun CardComponent(article: Article) {
    ElevatedCard(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .height(200.dp)

    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            AsyncImage(
                model = article.imgPath,
                contentDescription = article.contentDescription,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Bottom
            ) {
                TextCard(article)

            }
        }
    }
}

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