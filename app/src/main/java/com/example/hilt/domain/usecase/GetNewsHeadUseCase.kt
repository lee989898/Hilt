package com.example.hilt.domain.usecase

import com.example.hilt.domain.repository.NewsRepository

class GetNewsHeadUseCase(private val newsRepository: NewsRepository) {
}