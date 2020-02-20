package com.example.daggersample

import android.util.Log
import javax.inject.Inject

class Remote {

    @Inject
    constructor()

    fun setListener(car: Car) {
        Log.d("DaggerTest", "Remote connected.")
    }
}