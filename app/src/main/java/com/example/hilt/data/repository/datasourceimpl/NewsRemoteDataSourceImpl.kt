package com.example.hilt.data.repository.datasourceimpl

import com.example.hilt.data.api.NewsAPIService
import com.example.hilt.data.model.APIResponse
import com.example.hilt.data.repository.datasource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(private val newsAPIService: NewsAPIService, private val country: String, private val page: Int): NewsRemoteDataSource {
    override suspend fun getTopHeadlines(): Response<APIResponse> {
        return newsAPIService.getTopHeadlines(country,page)
    }
}