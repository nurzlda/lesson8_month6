package com.example.lesson8_month6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity(), OnClick, OnLongClick{

    private lateinit var animal: ArrayList<Animal>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animal = arrayListOf(Lion(), Mouse(), Snack())

        makeAnimalSound()
        animalCountLeg()
    }

    // 2.Принцип открытости-закрытости
    private fun makeAnimalSound() {
        for (i in animal) {
            Log.e("ololo", "makeAnimalSound: " + i.makeVoice())
        }
    }

    // 3.Принцип подстановки Барбары Лисков
    fun animalCountLeg(){
        for (animal in animal ){
            Log.e("ololo", "animalCountLeg: " + animal.legCount() )
        }
    }

    override fun onClick() {
        TODO("Not yet implemented")
    }

    override fun onLongClick() {
        TODO("Not yet implemented")
    }

}

