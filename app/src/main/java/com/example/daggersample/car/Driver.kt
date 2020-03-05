package com.example.daggersample.car

import javax.inject.Inject
import javax.inject.Singleton

class Driver {

    lateinit var name: String

    constructor(name: String) {
        this.name = name
    }
}