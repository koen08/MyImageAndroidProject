package com.koen.presentation.fragments.tape

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.koen.presentation.R
import com.koen.presentation.databinding.FragmentTapeBinding
import com.koen.presentation.fragments.core.BaseFragment
import com.koen.presentation.fragments.core.ViewModelFactory
import com.koen.presentation.fragments.design.DesignFragment
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class TapeFragment @Inject constructor(
    var viewModelProvider: ViewModelProvider
) : BaseFragment<FragmentTapeBinding>() {

    lateinit var viewModel: TapeViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("FRAGMENT", "onAttach()")
        viewModel = viewModelProvider[TapeViewModel::class.java]
    }

    override fun viewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentTapeBinding = FragmentTapeBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("FRAGMENT", "$viewModel :: ${viewModel.getValue()}")
    }

}