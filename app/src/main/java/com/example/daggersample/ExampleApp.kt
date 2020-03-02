package com.example.daggersample

import android.app.Application
import com.example.daggersample.dagger.ActivityComponent
import com.example.daggersample.dagger.AppComponent
import com.example.daggersample.dagger.DaggerActivityComponent

class ExampleApp : Application() {
    private lateinit var component: AppComponent

    override fun onCreate() {

//        component = DaggerAppC.create()

        super.onCreate()
    }

    fun getAppComponent(): AppComponent {
        return component
    }
}