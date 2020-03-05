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

        // ComponentFactory를 통해 코드를 좀 더 간소화한 모습.
        // Factory 사용의 장점 : 코드 간소화 및 create하는 과정에서 파라미터를 필수적으로 넘겨줘야 하기
        // 때문에 빌드 이전에 오류를 감지할 수 있으며 runtimeError를 방지할 수 있음.
        val component = (application as ExampleApp).getAppComponent()
            .getActivityComponentFactory()
            .create(150, 1400)

        component.inject(this)

        car1.drive()
        car2.drive()

//        component.getCar().drive()
//        component2.getCar().drive()
    }
}