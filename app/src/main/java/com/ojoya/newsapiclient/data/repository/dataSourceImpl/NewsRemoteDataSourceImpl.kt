package com.ojoya.newsapiclient.data.repository.dataSourceImpl

import com.ojoya.newsapiclient.data.api.NewsAPIService
import com.ojoya.newsapiclient.data.model.APIResponse
import com.ojoya.newsapiclient.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService
) : NewsRemoteDataSource {

    override suspend fun getNewsHeadlines(country: String, page: Int): Response<APIResponse> =
        newsAPIService.getNewsHeadlines(country, page)
}