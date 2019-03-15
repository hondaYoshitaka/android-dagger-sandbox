package com.github.hondaYoshitaka.sandbox.service.api

import com.github.hondaYoshitaka.sandbox.model.api.QiitaTag
import retrofit2.Call
import retrofit2.mock.BehaviorDelegate

class MockQiitaApi(
        private val delegate: BehaviorDelegate<QiitaApi>
) : QiitaApi {

    override fun fetchTags(page: Int?, perPage: Int?, sort: String?): Call<List<QiitaTag>> {
        val entities = ArrayList<QiitaTag>()

        return delegate.returningResponse(entities)
                .fetchTags(page, perPage, sort)
    }
}
