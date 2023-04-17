package com.example.homedrop_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.homedrop_example.api.RetrofitBuilder
import com.example.homedrop_example.databinding.ActivityMainBinding
import com.example.homedrop_example.model.ApiResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {

    private val TAG="MainActivity"

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val service=RetrofitBuilder.apiService

        GlobalScope.launch{
            val list= service.getUserListFromServer().enqueue(object : retrofit2.Callback<ApiResponse>{
                override fun onResponse(call: Call<ApiResponse>, response: Response<ApiResponse>) {

                }

                override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
                }

            })

        }
    }
}