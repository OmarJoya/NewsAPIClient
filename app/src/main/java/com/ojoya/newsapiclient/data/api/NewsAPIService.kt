package com.ojoya.newsapiclient.data.api

import com.ojoya.newsapiclient.BuildConfig
import com.ojoya.newsapiclient.data.model.APIResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPIService {

    @GET("v2/top-headlines")
    suspend fun getNewsHeadlines(
        @Query("country") country: String = "us",
        @Query("page") page: Int = 1,
        @Query("apikey") apiKey: String = BuildConfig.API_KEY
    ): Response<APIResponse>
}