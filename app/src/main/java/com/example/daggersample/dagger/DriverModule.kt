package com.example.daggersample.dagger

import com.example.daggersample.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule {

    @Provides
    @Singleton
    fun provideDriver(): Driver {
        return Driver()
    }
}