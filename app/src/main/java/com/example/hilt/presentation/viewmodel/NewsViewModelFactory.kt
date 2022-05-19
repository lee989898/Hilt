package com.example.hilt.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.hilt.domain.usecase.GetNewsHeadUseCase

class NewsViewModelFactory(private val app: Application,
                           val getNewsHeadUseCase: GetNewsHeadUseCase
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(
            app,
            getNewsHeadUseCase
        ) as T
    }
}