package com.example.daggersample.car

import com.example.daggersample.car.Rims
import com.example.daggersample.car.Tires
import javax.inject.Inject

class Wheels {

    var rims: Rims
    var tires: Tires

    @Inject
    constructor(rims: Rims, tires: Tires) {
        this.rims = rims
        this.tires = tires
    }
}