package com.ojoya.newsapiclient.domain.usecase

import com.ojoya.newsapiclient.data.model.APIResponse
import com.ojoya.newsapiclient.data.util.Resource
import com.ojoya.newsapiclient.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(): Resource<APIResponse> {
        return newsRepository.getNewsHeadlines()
    }
}