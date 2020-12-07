package com.example.dietmate.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.dietmate.R

class DietListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.diet_list_activity)

        val newDietButton = findViewById<Button>(R.id.button_new)
        newDietButton.setOnClickListener {view ->
            val intent = Intent(this, DietTypeActivity::class.java)
            startActivity(intent)
        }
    }
}