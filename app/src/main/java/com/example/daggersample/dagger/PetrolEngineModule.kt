package com.example.daggersample.dagger

import com.example.daggersample.car.Engine
import com.example.daggersample.dagger.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine
}