package com.koen.myimageandroidproject.di

import androidx.fragment.app.Fragment
import com.koen.myimageandroidproject.di.annotation.FragmentKey
import com.koen.presentation.fragments.design.DesignFragment
import com.koen.presentation.fragments.profile.ProfileFragment
import com.koen.presentation.fragments.tape.TapeFragment
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class FragmentBeanModule {
    @Binds
    @IntoMap
    @FragmentKey(TapeFragment::class)
    abstract fun bindsProfileFragment(tapeFragment: TapeFragment): Fragment

    @Binds
    @IntoMap
    @FragmentKey(DesignFragment::class)
    abstract fun bindsEditorFragment(designFragment: DesignFragment): Fragment

    @Binds
    @IntoMap
    @FragmentKey(ProfileFragment::class)
    abstract fun bindsTapeFragment(profileFragment: ProfileFragment): Fragment
}