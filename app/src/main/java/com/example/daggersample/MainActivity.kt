package com.example.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggersample.car.Car
import com.example.daggersample.dagger.CarComponent
import com.example.daggersample.dagger.DaggerCarComponent
import com.example.daggersample.dagger.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: CarComponent = DaggerCarComponent.builder()
            .dieselEngineModule(DieselEngineModule(100))
            .build()

        component.inject(this)

        car.drive()
    }
}