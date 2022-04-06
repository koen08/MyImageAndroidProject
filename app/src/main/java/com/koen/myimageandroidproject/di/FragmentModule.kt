package com.koen.myimageandroidproject.di

import com.koen.presentation.fragments.design.DesignFragment
import com.koen.presentation.fragments.profile.ProfileFragment
import com.koen.presentation.fragments.tape.TapeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {
    @ContributesAndroidInjector(modules = [TapeModule::class])
    abstract fun tapeFragment(): TapeFragment

    @ContributesAndroidInjector(modules = [DesignModule::class])
    abstract fun designFragment(): DesignFragment

    @ContributesAndroidInjector(modules = [ProfileModule::class])
    abstract fun profileFragment(): ProfileFragment
}