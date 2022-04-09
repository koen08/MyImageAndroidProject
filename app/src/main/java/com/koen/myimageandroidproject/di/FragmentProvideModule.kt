package com.koen.myimageandroidproject.di

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.koen.myimageandroidproject.di.annotation.FragmentKey
import com.koen.presentation.fragments.design.DesignFragment
import com.koen.presentation.fragments.profile.ProfileFragment
import com.koen.presentation.fragments.tape.TapeFragment
import dagger.Module
import dagger.Provides
import dagger.android.support.DaggerFragment
import dagger.multibindings.IntoMap

@Module
class FragmentProvideModule {
    @Provides
    @IntoMap
    @FragmentKey(TapeFragment::class)
    fun provideTapeFragment(viewModelProvider: ViewModelProvider): DaggerFragment = TapeFragment(
        viewModelProvider
    )

    @Provides
    @IntoMap
    @FragmentKey(DesignFragment::class)
    fun provideEditFragment(): DaggerFragment = DesignFragment()

    @Provides
    @IntoMap
    @FragmentKey(ProfileFragment::class)
    fun provideProfileFragment(): DaggerFragment = ProfileFragment()
}