package com.example.hiltkotlin

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

//Constructor Injection
@Singleton  //tüm uygulama kapsamında çalışır. @ActivityScoped olursa sadece activitylerde çalışır
class Musician
    @Inject
    constructor(instrument: Instrument, band: Band){

    fun sing(){
        println("singing...")
    }

}