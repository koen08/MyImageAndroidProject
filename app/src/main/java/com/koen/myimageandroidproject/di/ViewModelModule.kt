package com.koen.myimageandroidproject.di

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import com.koen.myimageandroidproject.di.annotation.ActivityScope
import com.koen.presentation.fragments.core.ViewModelFactory
import com.koen.presentation.fragments.design.DesignFragment
import com.koen.presentation.fragments.profile.ProfileFragment
import com.koen.presentation.fragments.tape.TapeFragment
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.support.DaggerFragment

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindsViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    companion object {
       @Provides
        fun provideViewModelProvider(
            factory: ViewModelProvider.Factory,
            fragment: DaggerFragment
        ): ViewModelProvider = ViewModelProvider(fragment, factory)
    }
}