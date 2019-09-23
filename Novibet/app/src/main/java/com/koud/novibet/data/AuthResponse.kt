package com.koud.novibet.data

import com.google.gson.annotations.SerializedName

data class AuthResponse(@SerializedName("token") var token:String? = null,
                        @SerializedName("type")  var type: String? = null)