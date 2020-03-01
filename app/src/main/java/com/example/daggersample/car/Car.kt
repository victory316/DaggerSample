package com.example.daggersample.car

import android.util.Log
import javax.inject.Inject

/**
 *
 *  현재 자바 스타일의 코드이나, 우선적으로 java 기반 튜토리얼을 진행하기 위함임.
 *
 *  이후 코틀린 스타일로 변환하며 차이점을 눈여겨볼 예정
 *
 */
class Car {

    private var driver: Driver
    private var engine: Engine
    private var wheels: Wheels

    @Inject
    constructor(driver: Driver, engine: Engine, wheels: Wheels) {
        this.driver = driver
        this.engine = engine
        this.wheels = wheels
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Log.d("daggerTest", "$driver drives $this")
        // Vroom
    }
}