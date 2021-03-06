package com.example.anilreddy.dinnerdecider

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val food = arrayListOf("Chinese", "Hamburger", "Pizza", "McDonalds", "Barros Pizza")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_dinner_decider.setOnClickListener {

            val random = Random()
            val randomFood = random.nextInt(food.count())

            food_text.text = food[randomFood]
        }

        btn_add_food.setOnClickListener {

            val newFood = et_add_new_food.text.toString()
            if (newFood != "" || !(newFood.isEmpty())){
            food.add(newFood)
            food_text.text = newFood
            et_add_new_food.text.clear()
            }  else{
                Toast.makeText(this,"Please Enter Food Name", Toast.LENGTH_SHORT).show()
            }

        }

    }
}
