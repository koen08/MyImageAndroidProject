package com.koen.myimageandroidproject.di

import android.app.Application
import com.koen.myimageandroidproject.ui.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(modules = [AndroidInjectionModule::class, ActivityModule::class])
interface AppComponent : AndroidInjector<App> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(instance: Application): Builder

        fun build(): AppComponent
    }
}