package com.example.daggersample.car

import android.util.Log
import javax.inject.Inject

class DieselEngine: Engine {
    private val TAG = "DieselEngine"

    @Inject
    constructor()

    override fun start() {
        Log.d("daggerTest", "$TAG started")
    }

}