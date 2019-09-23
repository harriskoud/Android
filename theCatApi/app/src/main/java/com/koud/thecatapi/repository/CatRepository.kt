package com.koud.thecatapi.repository

import com.koud.thecatapi.api.CatApi
import com.koud.thecatapi.data.Cat
import java.lang.Exception

class CatRepository(private val catApi: CatApi){

    val limit = 30

   override suspend fun getCats() : UseCaseResult<List<Cat>>{
        return try {
            val result = catApi.getCats(limit).await()
            UseCaseResult.Success(result)
        }catch (ex: Exception){
            UseCaseResult.Error(ex)
        }
    }
}