package com.example.daggersample.dagger

import android.util.Log
import com.example.daggersample.car.Engine
import javax.inject.Inject

class PetrolEngine: Engine {
    private val TAG = "PetrolEngine"

    @Inject
    constructor()

    override fun start() {
        Log.d("daggerTest", "$TAG started")
    }

}