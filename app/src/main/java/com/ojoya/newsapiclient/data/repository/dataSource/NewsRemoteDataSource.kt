package com.ojoya.newsapiclient.data.repository.dataSource

import com.ojoya.newsapiclient.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {

    suspend fun getNewsHeadlines(): Response<APIResponse>
}