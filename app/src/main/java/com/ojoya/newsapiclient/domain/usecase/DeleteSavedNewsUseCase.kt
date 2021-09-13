package com.ojoya.newsapiclient.domain.usecase

import com.ojoya.newsapiclient.data.model.Article
import com.ojoya.newsapiclient.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(article: Article) = newsRepository.deleteNews(article)
}