package com.koen.myimageandroidproject.di

import androidx.fragment.app.FragmentManager
import com.koen.myimageandroidproject.di.annotation.ActivityScope
import com.koen.myimageandroidproject.ui.CustomFragmentFactory
import com.koen.myimageandroidproject.ui.MainActivity
import com.koen.myimageandroidproject.ui.NavigationController
import dagger.Module
import dagger.Provides

@Module
class NavigationControllerModule {
    @Provides
    fun provideFragmentManager(mainActivity: MainActivity): FragmentManager {
        return mainActivity.supportFragmentManager
    }

    @Provides
    @ActivityScope
    fun provideNavController(
        customFragmentFactory: CustomFragmentFactory,
        fragmentManager: FragmentManager
    ): NavigationController {
        return NavigationController(fragmentManager, customFragmentFactory)
    }
}