package com.koud.thecatapi.data

import com.google.gson.annotations.SerializedName

data class Cat(val id: String,
               @SerializedName("url")
               val imageUrl: String
               )