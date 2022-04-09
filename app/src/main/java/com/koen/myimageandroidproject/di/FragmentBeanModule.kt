package com.koen.myimageandroidproject.di

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.koen.myimageandroidproject.di.annotation.FragmentKey
import com.koen.myimageandroidproject.ui.CustomFragmentFactory
import com.koen.presentation.fragments.design.DesignFragment
import com.koen.presentation.fragments.profile.ProfileFragment
import com.koen.presentation.fragments.tape.TapeFragment
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.support.DaggerFragment
import dagger.multibindings.IntoMap

@Module
abstract class FragmentBeanModule {
    /*   @Binds
       @IntoMap
       @FragmentKey(TapeFragment::class)
       abstract fun bindsTapeFragment(tapeFragment: TapeFragment): DaggerFragment

       @Binds
       @IntoMap
       @FragmentKey(DesignFragment::class)
       abstract fun bindsEditorFragment(designFragment: DesignFragment): DaggerFragment

       @Binds
       @IntoMap
       @FragmentKey(ProfileFragment::class)
       abstract fun bindsProfileFragment(profileFragment: ProfileFragment): DaggerFragment*/

/*
    @Binds
    abstract fun bindsCustomFactory(customFragmentFactory: CustomFragmentFactory): CustomFragmentFactory
*/
}