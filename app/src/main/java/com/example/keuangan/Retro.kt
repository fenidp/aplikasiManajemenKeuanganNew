package com.example.keuangan

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retro {
    fun getRetroClientInstance() : Retrofit {
        val gson = GsonBuilder().setLenient().create()
        return Retrofit.Builder()
            .baseUrl("https://feni.21076012.app-mobile.my.id/api/mobile/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
}