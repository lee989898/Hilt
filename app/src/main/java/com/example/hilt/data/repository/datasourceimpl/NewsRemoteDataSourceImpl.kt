package com.example.hilt.data.repository.datasourceimpl

import com.example.hilt.data.api.NewsAPIService
import com.example.hilt.data.model.APIResponse
import com.example.hilt.data.repository.datasource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(private val newsAPIService: NewsAPIService): NewsRemoteDataSource {
    override suspend fun getTopHeadlines(country: String, page: Int): Response<APIResponse> {
        return newsAPIService.getTopHeadlines(country,page)
    }
}