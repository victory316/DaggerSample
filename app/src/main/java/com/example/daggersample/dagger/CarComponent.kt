package com.example.daggersample.dagger

import com.example.daggersample.MainActivity
import com.example.daggersample.car.Car
import dagger.Component

@Component (modules = [WheelsModule::class, DieselEngineModule::class, WheelsModule::class])
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}