package com.example.mumblingwithkotlin.article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mumblingwithkotlin.bo.Article
import com.example.mumblingwithkotlin.templates.ArticlePage

val articlesList = listOf(
    Article(
        "Some title",
        "Some description",
        "https://picsum.photos/200",
        "Voyage"
    ),
    Article(
        "Some Title",
        "Some description",
        "https://picsum.photos/200",
        "yucca"
    ),
    Article(
        "Some Title",
        "Some description",
        "https://picsum.photos/200",
        "Geranium"
    ),
)


class ArticleDomain : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            ArticlePage(articlesList)
        }
    }
}


@Preview
@Composable
fun ArticleDomainPreview() {

    ArticlePage(articlesList)
}