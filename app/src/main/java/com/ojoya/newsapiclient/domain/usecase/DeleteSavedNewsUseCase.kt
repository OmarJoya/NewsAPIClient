package com.ojoya.newsapiclient.domain.usecase

import com.ojoya.newsapiclient.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
}