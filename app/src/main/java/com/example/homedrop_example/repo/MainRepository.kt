package com.example.homedrop_example.repo

import com.example.homedrop_example.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUserList()=apiHelper.getUserList()
}