package com.example.hilt.data.repository.dataSource

import com.example.hilt.data.model.APIResponse
import retrofit2.Response
import retrofit2.http.Query

interface NewsRemoteDataSource {

    suspend fun getTopHeadlines(country: String, page: Int): Response<APIResponse>
    suspend fun getSearchedNews(country: String,searchQuery: String, page: Int): Response<APIResponse>

}