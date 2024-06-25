package com.dineshprabha.moviesapp.data.network

import com.dineshprabha.moviesapp.common.Const
import com.dineshprabha.moviesapp.data.model.ApiResponse
import retrofit2.http.Query

interface ApiInterface {

    suspend fun getMoviesData(
        @Query("s") s: String = "army",
        @Query("apikey") apikey : String = Const.API_KEY
    ):ApiResponse
}