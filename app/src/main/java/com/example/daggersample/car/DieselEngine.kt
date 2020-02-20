package com.example.daggersample.car

import android.util.Log
import javax.inject.Inject

class DieselEngine: Engine {
    private val TAG = "DieselEngine"

    private var horsePower: Int

    @Inject
    constructor(horsePower: Int) {
        this.horsePower = horsePower
    }

    override fun start() {
        Log.d("daggerTest", "$TAG started. Horsepower : $horsePower")
    }

}