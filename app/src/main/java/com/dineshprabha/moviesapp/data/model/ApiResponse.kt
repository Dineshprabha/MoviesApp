package com.dineshprabha.moviesapp.data.model

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("Search")
    val dataList : List<MainData>?
)
