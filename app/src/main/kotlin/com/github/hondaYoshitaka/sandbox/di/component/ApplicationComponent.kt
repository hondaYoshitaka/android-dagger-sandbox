package com.github.hondaYoshitaka.sandbox.di.component

import com.github.hondaYoshitaka.sandbox.SandboxApplication
import com.github.hondaYoshitaka.sandbox.di.module.ActivityModule
import com.github.hondaYoshitaka.sandbox.di.module.ApplicationModule
import com.github.hondaYoshitaka.sandbox.di.module.NetworkModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


/**
 * ApplicationのDI Componentインタフェース.
 *
 * @author hondaYoshitaka
 */
@Component(modules = [
    AndroidSupportInjectionModule::class,
    ApplicationModule::class,
    ActivityModule::class,
    NetworkModule::class
])
@Singleton
interface ApplicationComponent : AndroidInjector<SandboxApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<SandboxApplication>()
}
