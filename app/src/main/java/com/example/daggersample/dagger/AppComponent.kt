package com.example.daggersample.dagger

import com.example.daggersample.car.Driver
import dagger.Component
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

//    fun getDriver(): Driver

    fun getActivityComponentFactory(): ActivityComponent.Factory

    // Dagger에서 factory 클래스를 알아서 생성함.
    @Component.Factory
    interface Factory {
        fun create(driverModule: DriverModule): AppComponent
    }
}