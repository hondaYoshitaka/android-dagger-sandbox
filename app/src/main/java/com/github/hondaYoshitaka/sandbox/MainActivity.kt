package com.github.hondaYoshitaka.sandbox

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection
import javax.inject.Inject
import com.github.hondaYoshitaka.sandbox.R
import com.github.hondaYoshitaka.sandbox.service.api.QiitaApi

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var qiitaApi: QiitaApi

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }
}
