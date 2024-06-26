package com.dineshprabha.moviesapp.data.repository

import com.dineshprabha.moviesapp.data.model.MainData
import com.dineshprabha.moviesapp.data.network.ApiInterface
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainRepository @Inject constructor(
    private val apiInterface: ApiInterface
) {

    suspend fun getMainData() : Flow<List<MainData>>{
        return flow {
            emit(
                apiInterface.getMoviesData().dataList ?: emptyList()
            )
        }
    }
}