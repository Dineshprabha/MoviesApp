package com.dineshprabha.moviesapp.data.model

import com.google.gson.annotations.SerializedName

data class MainData(
    @SerializedName("Title")
    val title : String,

    @SerializedName("Poster")
    val poster : String
)