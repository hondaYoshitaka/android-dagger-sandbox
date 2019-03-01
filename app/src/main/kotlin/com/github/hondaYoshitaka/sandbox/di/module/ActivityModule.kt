package com.github.hondaYoshitaka.sandbox.di.module

import com.github.hondaYoshitaka.sandbox.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * ActivityのDI Moduleクラス.
 *
 * @author hondaYoshitaka
 */
@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity

    // TODO: 他にinjectしたいactivityがあれば随時追加する
}
