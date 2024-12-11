package com.example.myapplication

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://my-json-server.typicode.com/Fotaxis/FakeJSON/" //TODO Тестовый адресс

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: GreenhouseApi by lazy {
        retrofit.create(GreenhouseApi::class.java)
    }
}
