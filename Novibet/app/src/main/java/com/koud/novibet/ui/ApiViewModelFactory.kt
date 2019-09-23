package com.koud.novibet.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.koud.novibet.api.ApiRepository

@Suppress("UNCHECKED_CAST")
class ApiViewModelFactory (private var apiRepository: ApiRepository): ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ApiViewModel(apiRepository) as T
    }
}