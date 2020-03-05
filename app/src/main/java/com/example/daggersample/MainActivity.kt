package com.example.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggersample.car.Car
//import com.example.daggersample.dagger.DaggerActivityComponent
import com.example.daggersample.dagger.DieselEngineModule
import dagger.android.DaggerActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var car1: Car
    @Inject lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Singleton 적용 예.
        val component = (application as ExampleApp).getAppComponent()
            .getActivityComponent(DieselEngineModule(120))

        component.inject(this)

        car1.drive()
        car2.drive()

//        component.getCar().drive()
//        component2.getCar().drive()
    }
}