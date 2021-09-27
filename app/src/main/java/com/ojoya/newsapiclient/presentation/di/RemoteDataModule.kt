package com.ojoya.newsapiclient.presentation.di

import com.ojoya.newsapiclient.data.api.NewsAPIService
import com.ojoya.newsapiclient.data.repository.dataSource.NewsRemoteDataSource
import com.ojoya.newsapiclient.data.repository.dataSourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(apiService: NewsAPIService): NewsRemoteDataSource {
        return NewsRemoteDataSourceImpl(apiService)
    }
}