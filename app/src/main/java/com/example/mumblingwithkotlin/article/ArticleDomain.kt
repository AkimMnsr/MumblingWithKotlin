package com.example.mumblingwithkotlin.article

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mumblingwithkotlin.bo.Article
import com.example.mumblingwithkotlin.templates.ArticleContainer
import com.example.mumblingwithkotlin.viewModel.ArticleViewModel


class ArticleDomain : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val articleViewModel = ArticleViewModel()

        articleViewModel.article.value = listOf(
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

        setContent {
            ArticleContainer(articleViewModel)
        }
    }
}


@SuppressLint("StateFlowValueCalledInComposition")
@Preview
@Composable
fun ArticleDomainPreview() {
    val articleViewModel = ArticleViewModel()

    articleViewModel.article.value = listOf(
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
    ArticleContainer(articleViewModel)
}