package com.example.daggersample.dagger

import com.example.daggersample.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule {
    private lateinit var driverName: String

    constructor(driverName: String) {
        this.driverName = driverName
    }

    @Provides
    @Singleton
    fun provideDriver(): Driver {
        return Driver(driverName)
    }
}