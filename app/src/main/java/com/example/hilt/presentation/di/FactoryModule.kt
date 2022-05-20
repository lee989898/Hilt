package com.example.hilt.presentation.di

import android.app.Application
import com.example.hilt.domain.repository.NewsRepository
import com.example.hilt.domain.usecase.GetNewsHeadlinesUseCase
import com.example.hilt.domain.usecase.GetSearchedNewsUseCase
import com.example.hilt.presentation.viewmodel.NewsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {

    @Singleton
    @Provides
    fun provideNewsViewModelFactory(
        application: Application,
        getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase,
        getSearchedNewsUseCase: GetSearchedNewsUseCase
    ): NewsViewModelFactory {
        return NewsViewModelFactory(
            application, getNewsHeadlinesUseCase, getSearchedNewsUseCase
        )
    }

}