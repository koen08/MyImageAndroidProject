package com.koen.myimageandroidproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.koen.myimageandroidproject.R
import com.koen.myimageandroidproject.databinding.ActivityMainBinding
import com.koen.presentation.fragments.design.DesignFragment
import com.koen.presentation.fragments.profile.ProfileFragment
import com.koen.presentation.fragments.tape.TapeFragment
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var navigationController: NavigationController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bottom: BottomNavigationView = binding.navigation
        bottom.setOnItemSelectedListener { id ->
            when (id.itemId) {
                R.id.menu_tape -> navigationController.makeCurrentFragment(TapeFragment::class.java)
                R.id.menu_edit -> navigationController.makeCurrentFragment(DesignFragment::class.java)
                R.id.menu_profile -> navigationController.makeCurrentFragment(ProfileFragment::class.java)
            }
            true
        }
    }
}