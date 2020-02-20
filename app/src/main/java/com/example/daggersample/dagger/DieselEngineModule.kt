package com.example.daggersample.dagger

import com.example.daggersample.car.DieselEngine
import com.example.daggersample.car.Engine
import com.example.daggersample.dagger.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {

    private var horsePower: Int

    constructor(horsePower: Int) {
        this.horsePower = horsePower
    }

    @Provides
    fun provideEngine(): Engine {
        return DieselEngine(horsePower)
    }
}