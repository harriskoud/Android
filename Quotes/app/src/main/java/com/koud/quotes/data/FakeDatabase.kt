package com.koud.quotes.data

class FakeDatabase {

    var fakeQuoteDao = FakeQuoteDao()
            private set

    companion object{

        @Volatile private var instance: FakeDatabase? = null

        fun getInstance() =
            instance ?: synchronized(this){
                instance ?: FakeDatabase().also { instance = it  }
            }

    }

}