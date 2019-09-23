package com.koud.novibet.api

import androidx.lifecycle.MutableLiveData
import com.koud.novibet.data.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONException

class ApiRepository {

    private var headlinesList = mutableListOf<HeadLine>()
    private var headLine = MutableLiveData<List<HeadLine>>()
    private var token: String? = null

    private val apiService = ApiServiceFactory.getApiService()


    fun getHeadLines(): MutableLiveData<List<HeadLine>> {

        val login = Login("your_first_name", "your_sire_name")
       CoroutineScope(Dispatchers.IO).launch {
            val response = apiService.getToken(login)
          withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful) {
                        token = response.body()?.token
                        val type = response.body()?.type;
                        val response = apiService.getHeadLines(token)
                        if (response.isSuccessful) {
                            headlinesList = response.body() as MutableList<HeadLine>
                            headLine.value = headlinesList
                        }

                    }
                } catch (e: JSONException) {
                    e.printStackTrace()
                }
            }
        }
        return headLine


    }



}