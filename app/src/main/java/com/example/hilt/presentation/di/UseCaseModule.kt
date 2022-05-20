package com.example.hilt.presentation.di

import com.example.hilt.domain.repository.NewsRepository
import com.example.hilt.domain.usecase.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Singleton
    @Provides
    fun provideGetNewsHeadLinesUseCase(
        newsRepository: NewsRepository
    ): GetNewsHeadlinesUseCase{
        return GetNewsHeadlinesUseCase(newsRepository)
    }

    @Singleton
    @Provides
    fun provideGetSearchedNewsUseCase(
        newsRepository: NewsRepository
    ): GetSearchedNewsUseCase{
        return GetSearchedNewsUseCase(newsRepository)
    }

    @Singleton
    @Provides
    fun provideSaveNewsUseCase(
        newsRepository: NewsRepository
    ): SaveNewsUseCase{
        return SaveNewsUseCase(newsRepository)
    }

    @Singleton
    @Provides
    fun provideGetSavedNewsUseCAse(
        newsRepository: NewsRepository
    ): GetSavedNewsUseCase{
        return GetSavedNewsUseCase(newsRepository)
    }

    @Singleton
    @Provides
    fun provideDeleteSavedNewsUseCAse(
        newsRepository: NewsRepository
    ): DeleteSavedNewsUseCase{
        return DeleteSavedNewsUseCase(newsRepository)
    }

}