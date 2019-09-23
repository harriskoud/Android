package com.koud.quotes.utils

import com.koud.quotes.data.FakeDatabase
import com.koud.quotes.data.QuotesRepository
import com.koud.quotes.data.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuotesRepository.getInstance(FakeDatabase.getInstance().fakeQuoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}