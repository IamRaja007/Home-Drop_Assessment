package com.example.homedrop_example.api

class ApiHelper(private val apiService: ApiService) {
    suspend fun getUserList() = apiService.getUserListFromServer()
}
