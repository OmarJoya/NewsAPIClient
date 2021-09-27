package com.ojoya.newsapiclient.presentation.di

import com.ojoya.newsapiclient.domain.usecase.GetNewsHeadlinesUseCase
import com.ojoya.newsapiclient.presentation.viewmodel.NewsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class FactoryModule {

    @Singleton
    @Provides
    fun provideNewsViewModelFactory(newsHeadlinesUseCase: GetNewsHeadlinesUseCase): NewsViewModelFactory {
        return NewsViewModelFactory(newsHeadlinesUseCase)
    }
}