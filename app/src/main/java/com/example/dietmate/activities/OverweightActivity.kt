package com.example.dietmate.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.dietmate.R
import com.example.dietmate.classes.Diet

class OverweightActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.overweight_activity)

        var newDiet : Diet = intent.getSerializableExtra("diet") as Diet

        val yesButton = findViewById<Button>(R.id.button_overweight_yes)
        yesButton.setOnClickListener {
            newDiet.setOverweight(true)
            val intent = Intent(this, WeightlifterActivity::class.java)
            intent.putExtra("diet", newDiet)
            startActivity(intent)
        }

        val noButton = findViewById<Button>(R.id.button_overweight_no)
        noButton.setOnClickListener {
            newDiet.setOverweight(false)
            val intent = Intent(this, WeightlifterActivity::class.java)
            intent.putExtra("diet", newDiet)
            startActivity(intent)
        }
    }
}