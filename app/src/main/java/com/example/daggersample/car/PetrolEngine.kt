package com.example.daggersample.car

import android.util.Log
import com.example.daggersample.car.Engine
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine: Engine {
    private val TAG = "PetrolEngine"

    private var horsePower: Int
    private var engineCapacity: Int

    // @Named : 같은 형을 가진 파라미터를 주입시 Named를 사용해 Dagger가 이를 분간하도록 할 수 있음.

    @Inject
    constructor(@Named("horse power")horsePower: Int, @Named("engine capacity") engineCapacity: Int) {
        this.horsePower = horsePower
        this.engineCapacity = engineCapacity
    }

    override fun start() {
        Log.d("daggerTest", "$TAG started + HP : $horsePower | " +
                "Engine capacity : $engineCapacity")
    }

}