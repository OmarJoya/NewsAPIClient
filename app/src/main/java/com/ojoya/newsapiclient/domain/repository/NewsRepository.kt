package com.ojoya.newsapiclient.domain.repository

import com.ojoya.newsapiclient.data.model.APIResponse
import com.ojoya.newsapiclient.data.model.Article
import com.ojoya.newsapiclient.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    suspend fun getNewsHeadlines(): Resource<APIResponse>

    suspend fun getSearchedNews(searchQuery: String): Resource<APIResponse>

    suspend fun deleteNews(article: Article)

    suspend fun saveNews(article: Article)

    fun getSavedNews(): Flow<List<Article>>
}