package com.example.hilt.data.repository.datasource

import com.example.hilt.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {

    suspend fun getTopHeadlines(): Response<APIResponse>
}