package com.example.homedrop_example.api

import com.example.homedrop_example.model.ApiResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("todos")
    fun getUserListFromServer():Call<ApiResponse>
}