package com.example.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggersample.car.Car
import com.example.daggersample.dagger.CarComponent
import com.example.daggersample.dagger.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: CarComponent = DaggerCarComponent.create()
        component.inject(this)

        car.drive()
    }
}