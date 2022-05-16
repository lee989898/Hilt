package com.example.hilt.presentation.di

import com.example.hilt.data.repository.NewsRepositoryImpl
import com.example.hilt.data.repository.datasource.NewsRemoteDataSource
import com.example.hilt.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource
    ): NewsRepository{
        return NewsRepositoryImpl(newsRemoteDataSource)
    }
}