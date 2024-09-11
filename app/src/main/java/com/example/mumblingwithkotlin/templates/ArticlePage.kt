package com.example.mumblingwithkotlin.templates

import androidx.compose.runtime.Composable
import com.example.mumblingwithkotlin.bo.Article
import com.example.mumblingwithkotlin.component.ArticleComponent
import com.example.mumblingwithkotlin.component.BasicComponent

@Composable
fun ArticlePage(articles: List<Article>){
    BasicComponent {
        ArticleComponent(articles)
    }
}