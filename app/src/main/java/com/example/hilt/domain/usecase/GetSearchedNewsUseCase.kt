package com.example.hilt.domain.usecase

import com.example.hilt.data.model.APIResponse
import com.example.hilt.data.util.Resource
import com.example.hilt.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(searchQuery: String): Resource<APIResponse>{
        return newsRepository.getSearchedNews(searchQuery)
    }

}