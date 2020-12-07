package com.example.dietmate.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.dietmate.R
import com.example.dietmate.classes.Diet

class WeightlifterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weightlifter_activity)

        var newDiet : Diet = intent.getSerializableExtra("diet") as Diet

        val yesButton = findViewById<Button>(R.id.button_yes)
        yesButton.setOnClickListener {
            newDiet.setWeightlifter(true)
            val intent = Intent(this, WeightlifterActivity::class.java)
            intent.putExtra("diet", newDiet)
            startActivity(intent)
        }

        val noButton = findViewById<Button>(R.id.button_no)
        yesButton.setOnClickListener {
            newDiet.setWeightlifter(true)
            val intent = Intent(this, WeightlifterActivity::class.java)
            intent.putExtra("diet", newDiet)
            startActivity(intent)
        }
    }
}