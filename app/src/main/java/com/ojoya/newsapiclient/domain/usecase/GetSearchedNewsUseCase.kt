package com.ojoya.newsapiclient.domain.usecase

import com.ojoya.newsapiclient.data.model.APIResponse
import com.ojoya.newsapiclient.data.util.Resource
import com.ojoya.newsapiclient.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(searchQuery: String): Resource<APIResponse> {
        return newsRepository.getSearchedNews(searchQuery)
    }
}