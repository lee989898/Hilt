package com.example.hilt.data.repository.dataSource

import com.example.hilt.data.model.Article
import kotlinx.coroutines.flow.Flow

interface NewsLocalDataSource {

    suspend fun saveArticleToDB(article: Article)

    fun getSavedArticles(): Flow<List<Article>>

    suspend fun deleteArticlesFromDB(article: Article)

}