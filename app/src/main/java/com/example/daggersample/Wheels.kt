package com.example.daggersample

import javax.inject.Inject

class Wheels {

    lateinit var rims: Rims
    lateinit var tires: Tires

    @Inject
    constructor(rims: Rims, tires: Tires) {
        this.rims = rims
        this.tires = tires
    }
}