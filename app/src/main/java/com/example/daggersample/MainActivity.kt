package com.example.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggersample.car.Car
import com.example.daggersample.dagger.CarComponent
import com.example.daggersample.dagger.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Singleton 적용 예.

        val component: CarComponent = DaggerCarComponent.builder()
            .horsePower(150)
            .engineCapacity(1400)
            .build()

        val component2: CarComponent = DaggerCarComponent.builder()
            .horsePower(150)
            .engineCapacity(1400)
            .build()

        component.inject(this)

        component.getCar().drive()
        component2.getCar().drive()
    }
}