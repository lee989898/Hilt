package com.example.hilt.presentation.di

import com.example.hilt.data.repository.NewsRepositoryImpl
import com.example.hilt.data.repository.dataSource.NewsLocalDataSource
import com.example.hilt.data.repository.dataSource.NewsRemoteDataSource
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
        newsRemoteDataSource: NewsRemoteDataSource,
        newsLocalDataSource: NewsLocalDataSource
    ): NewsRepository {
        return NewsRepositoryImpl(newsRemoteDataSource, newsLocalDataSource)
    }


}