package com.koen.myimageandroidproject.ui

import androidx.fragment.app.Fragment
import dagger.android.support.DaggerFragment
import javax.inject.Inject
import javax.inject.Provider

class CustomFragmentFactory @Inject constructor(
    val fragments: MutableMap<Class<out DaggerFragment>, @JvmSuppressWildcards Provider<DaggerFragment>>
) {

    fun <T : DaggerFragment> create(fragmentClass: Class<T>): T {
        val fragmentProvider = fragments[fragmentClass]
            ?: throw IllegalArgumentException("Fragment $fragmentClass not found")
        return fragmentProvider.get() as T
    }

}