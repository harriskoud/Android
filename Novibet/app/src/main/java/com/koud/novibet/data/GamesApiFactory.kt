package com.koud.novibet.data

import com.koud.novibet.api.ApiService
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ApiServiceFactory {
    const val BASE_URL = "https://mobiletest.free.beeceptor.com"

    fun getApiService(): ApiService {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build().create(ApiService::class.java)
    }



}