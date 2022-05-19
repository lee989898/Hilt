package com.example.hilt.presentation.di

import com.example.hilt.data.api.NewsAPIService
import com.example.hilt.data.repository.NewsRepositoryImpl
import com.example.hilt.data.repository.dataSource.NewsRemoteDataSource
import com.example.hilt.data.repository.dataSourceimpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(newsAPIService: NewsAPIService): NewsRemoteDataSource{
        return NewsRemoteDataSourceImpl(newsAPIService)
    }

}