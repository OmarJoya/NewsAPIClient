package com.ojoya.newsapiclient.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ojoya.newsapiclient.domain.usecase.GetNewsHeadlinesUseCase

class NewsViewModelFactory(private val newsHeadlinesUseCase: GetNewsHeadlinesUseCase) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(newsHeadlinesUseCase) as T
    }
}