package com.example.hilt.domain.repository

import com.example.hilt.data.model.APIResponse
import com.example.hilt.data.model.Article
import com.example.hilt.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    // api
    suspend fun getNewsHeadlines(country: String, page: Int): Resource<APIResponse>
    suspend fun getSearchedNews(searchQuery: String): Resource<APIResponse>

    // local
    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)
    fun getSavedNews(): Flow<List<Article>>


}