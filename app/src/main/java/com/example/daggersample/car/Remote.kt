package com.example.daggersample.car

import android.util.Log
import com.example.daggersample.car.Car
import javax.inject.Inject

class Remote {

    @Inject
    constructor()

    fun setListener(car: Car) {
        Log.d("daggerTest", "Remote connected.")
    }
}