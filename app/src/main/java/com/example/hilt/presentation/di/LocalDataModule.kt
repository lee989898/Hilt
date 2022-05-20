package com.example.hilt.presentation.di

import com.example.hilt.data.db.ArticleDAO
import com.example.hilt.data.repository.dataSource.NewsLocalDataSource
import com.example.hilt.data.repository.dataSourceimpl.NewsLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {

    @Singleton
    @Provides
    fun provideLocalDataSource(articleDAO: ArticleDAO): NewsLocalDataSource {
        return NewsLocalDataSourceImpl(articleDAO)
    }

}