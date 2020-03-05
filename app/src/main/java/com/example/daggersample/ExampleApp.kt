package com.example.daggersample

import android.app.Application
import com.example.daggersample.dagger.ActivityComponent
import com.example.daggersample.dagger.AppComponent
import com.example.daggersample.dagger.DaggerAppComponent
import com.example.daggersample.dagger.DriverModule

//import com.example.daggersample.dagger.DaggerActivityComponent

class ExampleApp : Application() {
    private lateinit var component: AppComponent

    override fun onCreate() {

        component = DaggerAppComponent.factory().create(DriverModule("Hans"))

        super.onCreate()
    }

    fun getAppComponent(): AppComponent {
        return component
    }
}