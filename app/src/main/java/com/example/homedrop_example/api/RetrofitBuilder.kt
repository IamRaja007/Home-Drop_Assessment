package com.example.homedrop_example.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    private fun getRetrofit(): Retrofit {
        val httpClient =
            OkHttpClient.Builder()
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        httpClient.addInterceptor(interceptor)
        return Retrofit.Builder()
            .baseUrl(BASE_URL).client(httpClient.build())
            .addConverterFactory(GsonConverterFactory.create())
            .build() //Doesn't require the adapter
    }

    val apiService: ApiService = getRetrofit().create(ApiService::class.java)
}