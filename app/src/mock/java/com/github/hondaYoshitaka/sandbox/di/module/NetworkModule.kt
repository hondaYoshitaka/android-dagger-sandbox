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
import com.github.hondaYoshitaka.sandbox.service.api.MockQiitaApi
import com.github.hondaYoshitaka.sandbox.service.api.QiitaApi
import retrofit2.mock.MockRetrofit

@Module
class NetworkModule {
    @Provides
    @Singleton
    fun provideGson(): Gson = GsonBuilder().create()

    @Provides
    @Singleton
    fun provideHttpClient(context: Context, gson: Gson): Retrofit {
        return Retrofit.Builder()
                .baseUrl(context.getString(R.string.api_url))
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
    }

    @Provides
    @Singleton
    fun provideQiitaApi(retrofit: Retrofit): QiitaApi {
        val mockRetrofit = MockRetrofit.Builder(retrofit).build()
        val api = mockRetrofit.create(QiitaApi::class.java)

        return MockQiitaApi(api)
    }
}
