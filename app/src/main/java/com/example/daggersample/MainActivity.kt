package com.example.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggersample.car.Car
import com.example.daggersample.dagger.DaggerActivityComponent
import dagger.android.DaggerActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var car1: Car
    @Inject lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Singleton 적용 예.
        val component = DaggerActivityComponent.builder()
            .horsePower(120)
            .engineCapacity(1400)
            .appComponent((application as ExampleApp).getAppComponent())
            .build()

        component.inject(this)

        car1.drive()
        car2.drive()

//        component.getCar().drive()
//        component2.getCar().drive()
    }
}