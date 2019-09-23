package com.koud.novibet.api

import androidx.lifecycle.MutableLiveData
import com.koud.novibet.data.AuthResponse
import com.koud.novibet.data.HeadLine
import com.koud.novibet.data.Login
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiService {

    @POST("/login")
    suspend fun getToken(@Body login: Login): Response<AuthResponse>

    @GET("/headlines")
    suspend fun getHeadLines(@Header("Authorization") authToken: String?): Response<List<HeadLine>>

}