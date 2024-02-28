package com.bignerdranch.android.watch.api

import retrofit2.Call
import retrofit2.http.GET

interface OMDbApi {
    @GET("/")
    fun fetchContents(): Call<String>
}