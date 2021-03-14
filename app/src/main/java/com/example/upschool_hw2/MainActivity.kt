package com.example.upschool_hw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonRoll.setOnClickListener {
            Toast.makeText(this,  "Dice are rolled.", Toast.LENGTH_SHORT).show()
            rollTheDice()
        }
        buttonReset.setOnClickListener {
            Toast.makeText(this,  "Dice has been reset.", Toast.LENGTH_SHORT).show()
            imageViewDice1.setImageResource(R.drawable.empty_dice)
            imageViewDice2.setImageResource(R.drawable.empty_dice)
        }
    }

    fun rollTheDice(){
        val dice1 : ImageView = findViewById(R.id.imageViewDice1)
        val dice2 : ImageView = findViewById(R.id.imageViewDice2)

        val randNum1 = (1..6).random()
        val randNum2 = Random.nextInt(1, 6)

        when(randNum1){
            1 -> dice1.setImageResource(R.drawable.dice_1)
            2 -> dice1.setImageResource(R.drawable.dice_2)
            3 -> dice1.setImageResource(R.drawable.dice_3)
            4 -> dice1.setImageResource(R.drawable.dice_4)
            5 -> dice1.setImageResource(R.drawable.dice_5)
            6 -> dice1.setImageResource(R.drawable.dice_6)
        }
        when(randNum2){
            1 -> dice2.setImageResource(R.drawable.dice_1)
            2 -> dice2.setImageResource(R.drawable.dice_2)
            3 -> dice2.setImageResource(R.drawable.dice_3)
            4 -> dice2.setImageResource(R.drawable.dice_4)
            5 -> dice2.setImageResource(R.drawable.dice_5)
            6 -> dice2.setImageResource(R.drawable.dice_6)
        }
    }
}