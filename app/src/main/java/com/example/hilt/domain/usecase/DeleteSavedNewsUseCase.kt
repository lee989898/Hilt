package com.example.hilt.domain.usecase

import com.example.hilt.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
}