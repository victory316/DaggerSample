package com.example.daggersample.car

import android.util.Log
import javax.inject.Inject

class Tires {
    @Inject
    constructor()

    fun inflate() {
        Log.d("daggerTest", "Tires inflated")
    }
}