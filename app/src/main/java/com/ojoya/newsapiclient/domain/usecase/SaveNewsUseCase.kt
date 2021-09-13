package com.ojoya.newsapiclient.domain.usecase

import com.ojoya.newsapiclient.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
}