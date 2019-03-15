package com.github.hondaYoshitaka.sandbox.service.api

import com.github.hondaYoshitaka.sandbox.model.api.QiitaTag
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface QiitaApi {

    @GET("api/v2/tags")
    fun fetchTags(
            @Query("page") page: Int? = null,
            @Query("per_page") perPage: Int? = null,
            @Query("sort") sort: String? = null
    ): Call<List<QiitaTag>>
}
