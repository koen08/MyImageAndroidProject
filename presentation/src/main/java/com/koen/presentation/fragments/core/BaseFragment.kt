package com.koen.presentation.fragments.core

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.koen.presentation.fragments.design.DesignFragment
import dagger.android.support.DaggerFragment
import kotlin.reflect.KClass

abstract class BaseFragment<V : ViewBinding>() : DaggerFragment() {

    protected lateinit var viewBindingData: V

    abstract fun viewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): V

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBindingData = viewBinding(inflater, container, savedInstanceState)
        return viewBindingData.root
    }
}