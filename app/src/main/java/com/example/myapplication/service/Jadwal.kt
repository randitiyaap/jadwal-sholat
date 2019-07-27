package com.example.myapplication.service

import com.example.myapplication.model.Jadwal
import com.example.myapplication.model.Result
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface Jadwal {
    @GET("indonesia.json")
    fun getJadwal(@Query("key") key: String): Observable<Result>
}