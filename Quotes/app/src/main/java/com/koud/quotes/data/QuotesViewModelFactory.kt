package com.koud.quotes.data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
class QuotesViewModelFactory (private var quotesRepository: QuotesRepository): ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuotesViewModel(quotesRepository) as T
    }
}