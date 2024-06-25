package com.dineshprabha.moviesapp.di

import com.dineshprabha.moviesapp.common.Const
import com.dineshprabha.moviesapp.data.network.ApiInterface
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class ApplicationModule {

    fun provideNetworkService():ApiInterface{
        return Retrofit.Builder()
            .baseUrl(Const.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)
    }
}