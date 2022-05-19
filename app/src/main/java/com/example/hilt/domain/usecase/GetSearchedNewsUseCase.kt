package com.example.hilt.domain.usecase

import com.example.hilt.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
}