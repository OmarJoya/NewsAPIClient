package com.ojoya.newsapiclient.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ojoya.newsapiclient.data.model.APIResponse
import com.ojoya.newsapiclient.data.util.Resource
import com.ojoya.newsapiclient.domain.usecase.GetNewsHeadlinesUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.lang.Exception

class NewsViewModel(private val newsHeadlinesUseCase: GetNewsHeadlinesUseCase) : ViewModel() {
    private val newsHeadLines: MutableLiveData<Resource<APIResponse>> = MutableLiveData()

    fun getNewsHeadLines(country: String, page: Int): Job =
        viewModelScope.launch(Dispatchers.IO) {
            try {
                newsHeadLines.postValue(Resource.Loading())
                val apiResult = newsHeadlinesUseCase.execute(country, page)
                newsHeadLines.postValue(apiResult)
            } catch (exception: Exception) {
                newsHeadLines.postValue(Resource.Error("${exception.message}"))
            }
        }
}