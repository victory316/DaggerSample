package com.example.daggersample.dagger

import com.example.daggersample.MainActivity
import com.example.daggersample.car.Car
import dagger.Component

@Component (modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}