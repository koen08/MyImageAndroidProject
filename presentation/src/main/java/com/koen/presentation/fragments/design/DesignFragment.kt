package com.koen.presentation.fragments.design

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.koen.presentation.R
import com.koen.presentation.databinding.FragmentDesignBinding
import com.koen.presentation.fragments.core.BaseFragment
import javax.inject.Inject

class DesignFragment @Inject constructor() : BaseFragment<FragmentDesignBinding>() {

    override fun viewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentDesignBinding =
        FragmentDesignBinding.inflate(inflater, container, false)

}