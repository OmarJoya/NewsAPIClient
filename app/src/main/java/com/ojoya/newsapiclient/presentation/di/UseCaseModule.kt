package com.ojoya.newsapiclient.presentation.di

import com.ojoya.newsapiclient.domain.repository.NewsRepository
import com.ojoya.newsapiclient.domain.usecase.GetNewsHeadlinesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
class UseCaseModule {

    @Singleton
    @Provides
    fun provideNewsHeadlinesUseCase(newsRepository: NewsRepository): GetNewsHeadlinesUseCase {
        return GetNewsHeadlinesUseCase(newsRepository)
    }
}