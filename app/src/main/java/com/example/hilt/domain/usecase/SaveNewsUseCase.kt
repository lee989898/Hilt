package com.example.hilt.domain.usecase

import com.example.hilt.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {

}