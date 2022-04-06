package com.koen.presentation.fragments.core

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.koen.presentation.fragments.design.DesignFragment
import dagger.android.support.DaggerFragment
import kotlin.reflect.KClass

abstract class BaseFragment(val clazz: KClass<out Fragment>) : DaggerFragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("FRAGMENT", "${clazz.simpleName} - onAttach()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("FRAGMENT", "${clazz.simpleName} - onCreate()")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("FRAGMENT", "${clazz.simpleName} - onCreateView()")
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}