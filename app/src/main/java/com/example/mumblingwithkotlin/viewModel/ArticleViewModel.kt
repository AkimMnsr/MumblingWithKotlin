package com.example.mumblingwithkotlin.viewModel

import androidx.lifecycle.ViewModel
import com.example.mumblingwithkotlin.bo.Article
import kotlinx.coroutines.flow.MutableStateFlow

class ArticleViewModel : ViewModel() {
    var article = MutableStateFlow(listOf<Article>())


    fun addArticle(): Article {
        return Article(
            "Added title",
            "Added description",
            "https://picsum.photos/200",
            "add description"
        )
    }
}