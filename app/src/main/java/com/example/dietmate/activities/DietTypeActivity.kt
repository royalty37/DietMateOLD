package com.example.dietmate.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.dietmate.R
import com.example.dietmate.classes.Diet

class DietTypeActivity : AppCompatActivity() {

    var newDiet = Diet()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.diet_type_activity)

        val loseWeightFastButton = findViewById<Button>(R.id.button_lose_weight_fast)
        loseWeightFastButton.setOnClickListener {
            newDiet.setDietType(0)
            val intent = Intent(this, WeightlifterActivity::class.java)
            intent.putExtra("diet", newDiet)
            startActivity(intent)
        }

        val loseWeightButton = findViewById<Button>(R.id.button_lose_weight)
        loseWeightButton.setOnClickListener {
            newDiet.setDietType(1)
            val intent = Intent(this, WeightlifterActivity::class.java)
            intent.putExtra("diet", newDiet)
            startActivity(intent)
        }

        val maintainWeightButton = findViewById<Button>(R.id.button_maintain_weight)
        maintainWeightButton.setOnClickListener {
            newDiet.setDietType(2)
            val intent = Intent(this, WeightlifterActivity::class.java)
            intent.putExtra("diet", newDiet)
            startActivity(intent)
        }

        val gainWeightButton = findViewById<Button>(R.id.button_gain_weight)
        gainWeightButton.setOnClickListener {
            newDiet.setDietType(3)
            val intent = Intent(this, WeightlifterActivity::class.java)
            intent.putExtra("diet", newDiet)
            startActivity(intent)
        }

        val gainWeightFastButton = findViewById<Button>(R.id.button_gain_weight_fast)
        gainWeightFastButton.setOnClickListener {
            newDiet.setDietType(4)
            val intent = Intent(this, WeightlifterActivity::class.java)
            intent.putExtra("diet", newDiet)
            startActivity(intent)
        }
    }
}