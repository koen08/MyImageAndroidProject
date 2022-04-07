package com.koen.presentation.fragments.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.koen.presentation.R
import com.koen.presentation.databinding.FragmentProfileBinding
import com.koen.presentation.fragments.core.BaseFragment
import com.koen.presentation.fragments.design.DesignFragment
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class ProfileFragment @Inject constructor(): BaseFragment<FragmentProfileBinding>() {

    override fun viewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentProfileBinding = FragmentProfileBinding.inflate(inflater, container, false)

}