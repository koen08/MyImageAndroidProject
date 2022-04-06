package com.koen.myimageandroidproject.di

import com.koen.myimageandroidproject.di.annotation.ActivityScope
import com.koen.myimageandroidproject.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(
        modules = [
            FragmentModule::class,
            FragmentBeanModule::class,
            NavigationControllerModule::class
        ]
    )
    abstract fun bindMainActivity(): MainActivity

}