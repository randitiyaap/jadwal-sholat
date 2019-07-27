package com.example.myapplication.service

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object Api {
    val retrofit: Retrofit

    init {
        retrofit = Retrofit.Builder()
                .baseUrl("http://muslimsalat.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    fun jadwalService() = retrofit.create(Jadwal::class.java)
}