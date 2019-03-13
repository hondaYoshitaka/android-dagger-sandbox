package com.github.hondaYoshitaka.sandbox

import com.github.hondaYoshitaka.sandbox.di.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/**
 * sandboxのアプリケーションクラス.
 *
 * @author hondaYoshitaka
 */
class SandboxApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
            DaggerApplicationComponent.builder().create(this)
}
