package com.github.hondaYoshitaka.sandbox

import com.github.hondaYoshitaka.sandbox.di.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.DaggerApplication
import javax.inject.Inject

/**
 * sandboxのアプリケーションクラス.
 *
 * @author hondaYoshitaka
 */
class SandboxApplication : DaggerApplication() {

    @Inject
    lateinit var applicationInjector: DispatchingAndroidInjector<DaggerApplication>

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = applicationInjector

    override fun onCreate() {
        DaggerApplicationComponent.builder()
                .build()
                .inject(this)

        super.onCreate()
    }
}
