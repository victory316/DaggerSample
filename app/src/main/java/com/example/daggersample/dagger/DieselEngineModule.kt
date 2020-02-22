package com.example.daggersample.dagger

import com.example.daggersample.car.DieselEngine
import com.example.daggersample.car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {

    private var horsePower: Int

    constructor(horsePower: Int) {
        this.horsePower = horsePower
    }

    @Provides
    fun provideEngine(engine: DieselEngine): Engine {
        return engine
    }

    @Provides
    fun provideHorsePower(): Int {
        return horsePower
    }
}