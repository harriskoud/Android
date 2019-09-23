package com.koud.thecatapi.api

import com.koud.thecatapi.data.Cat
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface CatApi{
    @GET("images/search")
    fun getCats(@Query("limit") limit:Int):Deferred<List<Cat>>
}