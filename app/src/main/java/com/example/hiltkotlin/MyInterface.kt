package com.example.hiltkotlin

import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterface {

    fun myPrintFunction() : String

}

/*

YONTEM 1

@InstallIn(SingletonComponent::class)
@Module
abstract class MyModule{
    @Singleton
    @Binds
    abstract fun bindingFunction(myImplementer: InterfaceImplementer) : MyInterface
}

 */

@InstallIn(SingletonComponent::class)
@Module
class MyModule{

    @FirstImplementer
    @Singleton
    @Provides
    fun providerFunction() : MyInterface{
        return InterfaceImplementer()
    }

    @SecondImplementer
    @Singleton
    @Provides
    fun secondProviderFunction() : MyInterface{
        return SecondInterfaceImplementer()
    }

    @Singleton
    @Provides
    fun gsonProvider() : Gson{
        return Gson()
    }
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplementer

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementer