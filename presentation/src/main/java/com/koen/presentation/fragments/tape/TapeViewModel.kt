package com.koen.presentation.fragments.tape

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject
import kotlin.random.Random

class TapeViewModel @Inject constructor() : ViewModel() {
    private val valueRandom: Int by lazy {
        val x = Random.nextInt(100)
        x
    }

    fun getValue() : Int = valueRandom

    override fun onCleared() {
        super.onCleared()
        Log.i("FRAGMENT", "onCleared()")
    }
}