package com.koud.quotes.data

import androidx.lifecycle.ViewModel

class QuotesViewModel(private val quotesRepository: QuotesRepository) : ViewModel(){


    fun getQuotes() = quotesRepository.getQuotes()

    fun addQuote(quote: Quote) {
        quotesRepository.addQuote(quote)
    }

}