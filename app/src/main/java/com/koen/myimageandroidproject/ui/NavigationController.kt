package com.koen.myimageandroidproject.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.koen.myimageandroidproject.R
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class NavigationController @Inject constructor(
    private val fragmentManager: FragmentManager,
    private val customFragmentFactory: CustomFragmentFactory
) {

    fun <T : DaggerFragment> makeCurrentFragment(fragmentClass: Class<T>) {
        val fragment = customFragmentFactory.create(fragmentClass)
        fragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}