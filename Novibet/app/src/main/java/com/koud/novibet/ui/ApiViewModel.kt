package com.koud.novibet.ui

import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.koud.novibet.api.ApiRepository
import com.koud.novibet.data.ApiServiceFactory
import com.koud.novibet.data.AuthResponse
import com.koud.novibet.data.Login
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONException

class ApiViewModel (private val apiRepository: ApiRepository): ViewModel(){

    fun getHeadLines() = apiRepository.getHeadLines()


    }

