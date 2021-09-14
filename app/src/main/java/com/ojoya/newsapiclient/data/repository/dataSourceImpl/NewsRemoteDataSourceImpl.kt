package com.ojoya.newsapiclient.data.repository.dataSourceImpl

import com.ojoya.newsapiclient.data.api.NewsAPIService
import com.ojoya.newsapiclient.data.model.APIResponse
import com.ojoya.newsapiclient.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService,
    private val country: String,
    private val page: Int
) : NewsRemoteDataSource {

    override suspend fun getNewsHeadlines(): Response<APIResponse> =
        newsAPIService.getNewsHeadlines(country, page)
}