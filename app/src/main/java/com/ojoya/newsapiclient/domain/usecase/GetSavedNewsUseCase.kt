package com.ojoya.newsapiclient.domain.usecase

import com.ojoya.newsapiclient.data.model.Article
import com.ojoya.newsapiclient.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {

    fun execute(): Flow<List<Article>> {
        return newsRepository.getSavedNews()
    }
}