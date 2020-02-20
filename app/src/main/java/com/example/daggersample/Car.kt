package com.example.daggersample

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
    var engine: Engine
    var wheels: Wheels

    @Inject
    constructor(engine: Engine, wheels: Wheels) {
        this.engine = engine
        this.wheels = wheels
    }

    fun drive() {
        Log.d("daggerTest", "Let's driveee")
        // Vroom
    }
}