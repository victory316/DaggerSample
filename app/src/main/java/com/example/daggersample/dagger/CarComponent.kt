package com.example.daggersample.dagger

import com.example.daggersample.MainActivity
import com.example.daggersample.car.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component (modules = [PetrolEngineModule::class, WheelsModule::class])
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horse power") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity: Int): Builder

        fun build(): CarComponent
    }
}