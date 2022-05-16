package com.example.hilt.presentation.di

import com.example.hilt.data.api.NewsAPIService
import com.example.hilt.data.repository.datasource.NewsRemoteDataSource
import com.example.hilt.data.repository.datasourceimpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RemoteModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(newsAPIService: NewsAPIService): NewsRemoteDataSource{
        return NewsRemoteDataSourceImpl(newsAPIService)
    }

}