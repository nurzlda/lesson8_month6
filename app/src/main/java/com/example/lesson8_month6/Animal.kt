package com.example.lesson8_month6


// 1.Принцип единственной ответственности
open class Animal() {

   open fun makeVoice():String{
        return ""
    }

    open fun legCount() : Int{
        return 0
    }

}

class AnimalDB(){

    fun getAnimal():Animal {
        return Animal()
    }

}

class Lion() : Animal(){

    override fun makeVoice(): String {
        return "Roar"
    }

    override fun legCount(): Int {
        return 4
    }

}
class Mouse() : Animal(){

    override fun makeVoice(): String {
        return "Squeak"
    }

    override fun legCount(): Int {
        return 4
    }

}class Snack() : Animal(){

    override fun makeVoice(): String {
        return "Shhh"
    }

    override fun legCount(): Int {
        return 0
    }

}