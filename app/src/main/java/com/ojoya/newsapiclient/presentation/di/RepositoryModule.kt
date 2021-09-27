package com.ojoya.newsapiclient.presentation.di

import com.ojoya.newsapiclient.data.repository.NewsRepositoryImpl
import com.ojoya.newsapiclient.data.repository.dataSource.NewsRemoteDataSource
import com.ojoya.newsapiclient.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(newsRemoteDataSource: NewsRemoteDataSource): NewsRepository {
        return NewsRepositoryImpl(newsRemoteDataSource)
    }
}