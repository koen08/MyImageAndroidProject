package com.koen.myimageandroidproject.di

import android.app.Application
import com.koen.myimageandroidproject.ui.App
import com.koen.presentation.fragments.tape.TapeViewModel
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AndroidInjectionModule::class,
        ActivityModule::class,
        FragmentProvideModule::class,
        FragmentBeanModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(instance: Application): Builder

        fun build(): AppComponent
    }
}