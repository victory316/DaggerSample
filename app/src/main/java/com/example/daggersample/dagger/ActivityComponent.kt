package com.example.daggersample.dagger

import com.example.daggersample.MainActivity
import com.example.daggersample.car.Car
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(modules = [PetrolEngineModule::class, WheelsModule::class])
interface ActivityComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory {

        fun create(@BindsInstance @Named("horse power") horsePower: Int,
                   @BindsInstance @Named("engine capacity") engineCapacity: Int): ActivityComponent
    }
}