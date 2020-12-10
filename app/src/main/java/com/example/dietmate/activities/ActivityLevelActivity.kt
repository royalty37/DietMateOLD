package com.example.dietmate.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.dietmate.R
import com.example.dietmate.classes.Diet

class ActivityLevelActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_activity)

        var newDiet : Diet = intent.getSerializableExtra("diet") as Diet

        val noExerciseButton = findViewById<Button>(R.id.button_no_exercise)
        noExerciseButton.setOnClickListener {
            newDiet.setActivityLevel(0)
            val intent = Intent(this, UserStatsActivity::class.java)
            intent.putExtra("diet", newDiet)
            startActivity(intent)
        }

        val lightExerciseButton = findViewById<Button>(R.id.button_light_exercise)
        lightExerciseButton.setOnClickListener {
            newDiet.setActivityLevel(1)
            val intent = Intent(this, UserStatsActivity::class.java)
            intent.putExtra("diet", newDiet)
            startActivity(intent)
        }

        val moderateExerciseButton = findViewById<Button>(R.id.button_moderate_exercise)
        moderateExerciseButton.setOnClickListener {
            newDiet.setActivityLevel(2)
            val intent = Intent(this, UserStatsActivity::class.java)
            intent.putExtra("diet", newDiet)
            startActivity(intent)
        }

        val highExerciseButton = findViewById<Button>(R.id.button_high_exercise)
        highExerciseButton.setOnClickListener {
            newDiet.setActivityLevel(3)
            val intent = Intent(this, UserStatsActivity::class.java)
            intent.putExtra("diet", newDiet)
            startActivity(intent)
        }

        val veryHighExerciseButton = findViewById<Button>(R.id.button_very_high_exercise)
        veryHighExerciseButton.setOnClickListener {
            newDiet.setActivityLevel(4)
            val intent = Intent(this, UserStatsActivity::class.java)
            intent.putExtra("diet", newDiet)
            startActivity(intent)
        }

        val extraHighExerciseButton = findViewById<Button>(R.id.button_extra_high_exercise)
        extraHighExerciseButton.setOnClickListener {
            newDiet.setActivityLevel(5)
            val intent = Intent(this, UserStatsActivity::class.java)
            intent.putExtra("diet", newDiet)
            startActivity(intent)
        }
    }
}