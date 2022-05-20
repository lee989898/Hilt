package com.example.hilt.domain.usecase

import com.example.hilt.data.model.APIResponse
import com.example.hilt.data.util.Resource
import com.example.hilt.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(country: String, searchQuery: String, page: Int): Resource<APIResponse>{
        return newsRepository.getSearchedNews(country,searchQuery,page)
    }

}