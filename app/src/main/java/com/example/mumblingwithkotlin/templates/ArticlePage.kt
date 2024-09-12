package com.example.mumblingwithkotlin.templates

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mumblingwithkotlin.component.BasicComponent
import com.example.mumblingwithkotlin.component.CardComponent
import com.example.mumblingwithkotlin.component.TextTitleComponent
import com.example.mumblingwithkotlin.ui.theme.borderBouttonColor
import com.example.mumblingwithkotlin.ui.theme.bouttonColor
import com.example.mumblingwithkotlin.viewModel.ArticleViewModel


@Composable
fun ArticleContainer(articleViewModel: ArticleViewModel) {
    BasicComponent {
        ArticlePage(articleViewModel)
    }
}

@Composable
fun ArticlePage(articleViewModel: ArticleViewModel) {
    val articleState by articleViewModel.article.collectAsState()
    Column(
        modifier = Modifier
            .padding(40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextTitleComponent(label = "Articles")
        LazyColumn(
            modifier = Modifier
                .padding(vertical = 20.dp)
                .height(525.dp)
        ) {
            items(articleState) { article ->
                CardComponent(article)
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
                .clip(RoundedCornerShape(40.dp)),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            ),
            onClick = {
                articleViewModel.addArticle()
            },
            contentPadding = PaddingValues(),
            border = BorderStroke(1.dp, borderBouttonColor)
        ) {
            Box(
                modifier = Modifier
                    .background(bouttonColor)
                    .fillMaxWidth()
                    .padding(vertical = 15.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Add article",
                    style = TextStyle(
                        color = Color.White,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp
                    )
                )
            }

        }
    }
}