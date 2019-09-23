package com.koud.quotes.data

class QuotesRepository constructor(var fakeQuoteDao: FakeQuoteDao){


    fun addQuote(quote: Quote){
        fakeQuoteDao.addQuote(quote)
    }

    fun getQuotes() = fakeQuoteDao.getQuotes()

    companion object {

        @Volatile private var instance: QuotesRepository?= null

        fun getInstance(fakeQuoteDao:FakeQuoteDao) =
            instance ?: synchronized(this){
                instance?: QuotesRepository(fakeQuoteDao).also { instance = it }
            }
    }


}