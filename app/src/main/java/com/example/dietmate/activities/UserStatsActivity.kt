package com.example.dietmate.activities

import android.content.Intent
import android.os.Bundle
import android.widget.*
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.isDigitsOnly
import com.example.dietmate.R
import com.example.dietmate.classes.Diet

class UserStatsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_stats_activity)

        var newDiet : Diet = intent.getSerializableExtra("diet") as Diet

        val ageEditText : EditText = findViewById(R.id.edittext_age)
        val heightEditText : EditText = findViewById(R.id.edittext_height)
        val weightEditText : EditText = findViewById(R.id.edittext_weight)

        val genderSpinner : Spinner = findViewById(R.id.spinner_gender)
        ArrayAdapter.createFromResource(this, R.array.gender_array, android.R.layout.simple_spinner_item).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            genderSpinner.adapter = adapter
        }

        val nextButton : Button = findViewById<Button>(R.id.button_next)
        nextButton.setOnClickListener { view ->
            when {
                ageEditText.text.toString().isEmpty() -> Toast.makeText(this, "Please enter age", Toast.LENGTH_SHORT).show()
                !ageEditText.text.toString().isDigitsOnly() -> Toast.makeText(this, "Invalid age", Toast.LENGTH_SHORT).show()
                heightEditText.text.toString().isEmpty() -> Toast.makeText(this, "Please enter height", Toast.LENGTH_SHORT).show()
                !heightEditText.text.toString().isDigitsOnly() -> Toast.makeText(this, "Invalid height", Toast.LENGTH_SHORT).show()
                weightEditText.text.toString().isEmpty() -> Toast.makeText(this, "Please enter weight", Toast.LENGTH_SHORT).show()
                !weightEditText.text.toString().isDigitsOnly() -> Toast.makeText(this, "Invalid weight", Toast.LENGTH_SHORT).show()
                else -> {
                    newDiet.setAge(ageEditText.text.toString().toInt())
                    newDiet.setHeight(heightEditText.text.toString().toInt())
                    newDiet.setWeight(weightEditText.text.toString().toInt())
                    if (genderSpinner.selectedItem.toString() == "Male")
                        newDiet.setGender(0)
                    else if (genderSpinner.selectedItem.toString() == "Female")
                        newDiet.setGender(1)
                    val intent = Intent(this, DisplayDietActivity::class.java)
                    intent.putExtra("diet", newDiet)
                    startActivity(intent)
                }
            }
        }
    }
}