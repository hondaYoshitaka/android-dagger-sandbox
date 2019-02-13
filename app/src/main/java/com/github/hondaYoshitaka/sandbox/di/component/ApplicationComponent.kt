package com.github.hondaYoshitaka.sandbox.di.component

import com.github.hondaYoshitaka.sandbox.SandboxApplication
import com.github.hondaYoshitaka.sandbox.di.module.ActivityModule
import com.github.hondaYoshitaka.sandbox.di.module.ApplicationModule
import com.github.hondaYoshitaka.sandbox.di.module.FragmentModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton


/**
 * ApplicationのDI Componentインタフェース.
 *
 * @author hondaYoshitaka
 */
@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    ApplicationModule::class,
    ActivityModule::class,
    FragmentModule::class
])
abstract class ApplicationComponent : AndroidInjector<SandboxApplication> {

//    @Component.Builder
//    abstract class Builder : AndroidInjector.Builder<SandboxApplication>() {
//        abstract fun applicationModule(module: ApplicationModule): Builder
//    }
}
