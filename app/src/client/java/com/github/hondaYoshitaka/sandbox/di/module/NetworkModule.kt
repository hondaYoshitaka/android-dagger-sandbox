package com.github.hondaYoshitaka.sandbox.di.module

import android.content.Context
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton
import com.github.hondaYoshitaka.sandbox.R
import com.github.hondaYoshitaka.sandbox.service.SampleService

@Module
class NetworkModule {
    @Provides
    @Singleton
    fun provideGson(): Gson = GsonBuilder().create()

    @Provides
    @Singleton
    fun provideRetrofit(context: Context, gson: Gson): Retrofit = Retrofit.Builder()
            .baseUrl(context.getString(R.string.api_url))
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

    @Provides
    @Singleton
    fun provideSampleService(retrofit: Retrofit):SampleService = SampleService(retrofit)
}
