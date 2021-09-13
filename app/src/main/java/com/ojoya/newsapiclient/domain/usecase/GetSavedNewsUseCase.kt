package com.ojoya.newsapiclient.domain.usecase

import com.ojoya.newsapiclient.domain.repository.NewsRepository

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
}