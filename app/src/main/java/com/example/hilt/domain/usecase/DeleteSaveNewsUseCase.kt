package com.example.hilt.domain.usecase

import com.example.hilt.data.model.Article
import com.example.hilt.domain.repository.NewsRepository

class DeleteSaveNewsUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(article: Article) = newsRepository.deleteNews(article)

}