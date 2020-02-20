package com.example.daggersample.dagger

import com.example.daggersample.car.Engine
import com.example.daggersample.dagger.PetrolEngine
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {

    @Provides
    fun provideEngine(engine: PetrolEngine): Engine {
        return engine
    }
}