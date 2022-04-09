package com.koen.myimageandroidproject.di

import androidx.lifecycle.ViewModel
import com.koen.myimageandroidproject.di.annotation.ViewModelKey
import com.koen.presentation.fragments.tape.TapeViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
abstract class TapeModule {
    @Binds
    @IntoMap
    @ViewModelKey(TapeViewModel::class)
    abstract fun provideTapeViewModel(tapeViewModel: TapeViewModel) : ViewModel
}