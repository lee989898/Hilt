package com.example.hilt.domain.usecase

import com.example.hilt.data.model.APIResponse
import com.example.hilt.data.util.Resource
import com.example.hilt.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(country: String, page: Int): Resource<APIResponse>{
        return newsRepository.getNewsHeadlines(country, page)
    }
}