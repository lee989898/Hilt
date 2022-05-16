package com.example.hilt.domain.usecase

import com.example.hilt.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val news: NewsRepository) {

}