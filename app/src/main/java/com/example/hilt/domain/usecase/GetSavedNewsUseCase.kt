package com.example.hilt.domain.usecase

import com.example.hilt.domain.repository.NewsRepository

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
}