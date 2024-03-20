package com.arjungupta08.fakestoredagger.di

import com.arjungupta08.fakestoredagger.Constants
import com.arjungupta08.fakestoredagger.retrofit.FakerApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun providesRetrofit() : Retrofit {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun providesFakerApi(retrofit: Retrofit) : FakerApi {
        return retrofit.create(FakerApi::class.java)
    }

}