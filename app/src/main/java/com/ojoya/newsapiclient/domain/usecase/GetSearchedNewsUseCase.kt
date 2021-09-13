package com.ojoya.newsapiclient.domain.usecase

import com.ojoya.newsapiclient.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
}