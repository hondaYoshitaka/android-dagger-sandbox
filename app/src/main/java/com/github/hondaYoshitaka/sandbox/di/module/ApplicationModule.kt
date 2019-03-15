package com.github.hondaYoshitaka.sandbox.di.module

import android.content.Context
import com.github.hondaYoshitaka.sandbox.SandboxApplication
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

/**
 * ApplicationのDI Moduleクラス.
 *
 * @author hondaYoshitaka
 */
@Module
abstract class ApplicationModule {
    @Binds
    @Singleton
    abstract fun provideContext(app: SandboxApplication): Context
}
