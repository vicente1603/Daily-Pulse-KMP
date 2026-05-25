package com.petros.efthymiou.dailypulse.articles

import com.petros.efthymiou.dailypulse.BaseViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ArticlesViewModel: BaseViewModel() {

    private val _articlesState: MutableStateFlow<ArticlesState> = MutableStateFlow(ArticlesState(loading = true))

    val articlesState: StateFlow<ArticlesState> get() = _articlesState

    init {
        getArticles()
    }

    private fun getArticles(){

        scope.launch {
            delay(1500)

            _articlesState.emit(ArticlesState(error = "erro"))

            delay(1500)

            val fetched = fetchArticles()

            _articlesState.emit(ArticlesState(articles = fetched))
        }

    }

    suspend fun fetchArticles(): List<Article> = mockArticles


    private val mockArticles = listOf(
        Article(title = "bla bla", desc = "fafa", date = "dcsd", imageUrl = "html"),
        Article(title = "bla bla", desc = "fafa", date = "dcsd", imageUrl = "html"),
                Article(title = "bla bla", desc = "fafa", date = "dcsd", imageUrl = "html")

    )

}