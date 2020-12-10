package com.example.dietmate.activities

import android.os.Bundle
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.dietmate.R
import com.example.dietmate.classes.Diet
import org.w3c.dom.Text

class DisplayDietActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.display_diet_activity)

        var newDiet : Diet = intent.getSerializableExtra("diet") as Diet
        newDiet.generateCalorieBreakdown()
        newDiet.generateFoodList()

        var foods : ArrayList<Diet.food> = newDiet.getMyFoods()

        val caloriesNumberText = findViewById<TextView>(R.id.text_table_calories_number)
        caloriesNumberText.text = newDiet.getCalories().toString()
        val proteinNumberText = findViewById<TextView>(R.id.text_table_protein_number)
        proteinNumberText.text = newDiet.getProtein().toString()
        val fatNumberText = findViewById<TextView>(R.id.text_table_fat_number)
        fatNumberText.text = newDiet.getFat().toString()
        val carbohydratesNumberText = findViewById<TextView>(R.id.text_table_carbohydrates_number)
        carbohydratesNumberText.text = newDiet.getCarbohydrates().toString()

        var i = 1;
        for (item in foods) {
            if (i == 1) {
                var cell1Text = findViewById<TextView>(R.id.text_table_row1_cell1)
                cell1Text.text = item.getTitle()
                var cell2Text = findViewById<TextView>(R.id.text_table_row1_cell2)
                cell2Text.text = (item.getProtein()*4+item.getFat()*9+item.getCarbohydrates()*4).toString()
                var cell3Text = findViewById<TextView>(R.id.text_table_row1_cell3)
                cell3Text.text = item.getProtein().toString()
                var cell4Text = findViewById<TextView>(R.id.text_table_row1_cell4)
                cell4Text.text = item.getFat().toString()
                var cell5Text = findViewById<TextView>(R.id.text_table_row1_cell5)
                cell5Text.text = item.getCarbohydrates().toString()
            }
            else if (i == 2) {
                var cell1Text = findViewById<TextView>(R.id.text_table_row2_cell1)
                cell1Text.text = item.getTitle()
                var cell2Text = findViewById<TextView>(R.id.text_table_row2_cell2)
                cell2Text.text = (item.getProtein()*4+item.getFat()*9+item.getCarbohydrates()*4).toString()
                var cell3Text = findViewById<TextView>(R.id.text_table_row2_cell3)
                cell3Text.text = item.getProtein().toString()
                var cell4Text = findViewById<TextView>(R.id.text_table_row2_cell4)
                cell4Text.text = item.getFat().toString()
                var cell5Text = findViewById<TextView>(R.id.text_table_row2_cell5)
                cell5Text.text = item.getCarbohydrates().toString()
            }
            else if (i == 3) {
                var cell1Text = findViewById<TextView>(R.id.text_table_row3_cell1)
                cell1Text.text = item.getTitle()
                var cell2Text = findViewById<TextView>(R.id.text_table_row3_cell2)
                cell2Text.text = (item.getProtein()*4+item.getFat()*9+item.getCarbohydrates()*4).toString()
                var cell3Text = findViewById<TextView>(R.id.text_table_row3_cell3)
                cell3Text.text = item.getProtein().toString()
                var cell4Text = findViewById<TextView>(R.id.text_table_row3_cell4)
                cell4Text.text = item.getFat().toString()
                var cell5Text = findViewById<TextView>(R.id.text_table_row3_cell5)
                cell5Text.text = item.getCarbohydrates().toString()
            }
            else if (i == 4) {
                var cell1Text = findViewById<TextView>(R.id.text_table_row4_cell1)
                cell1Text.text = item.getTitle()
                var cell2Text = findViewById<TextView>(R.id.text_table_row4_cell2)
                cell2Text.text = (item.getProtein()*4+item.getFat()*9+item.getCarbohydrates()*4).toString()
                var cell3Text = findViewById<TextView>(R.id.text_table_row4_cell3)
                cell3Text.text = item.getProtein().toString()
                var cell4Text = findViewById<TextView>(R.id.text_table_row4_cell4)
                cell4Text.text = item.getFat().toString()
                var cell5Text = findViewById<TextView>(R.id.text_table_row4_cell5)
                cell5Text.text = item.getCarbohydrates().toString()
            }
            else if (i == 5) {
                var cell1Text = findViewById<TextView>(R.id.text_table_row5_cell1)
                cell1Text.text = item.getTitle()
                var cell2Text = findViewById<TextView>(R.id.text_table_row5_cell2)
                cell2Text.text = (item.getProtein()*4+item.getFat()*9+item.getCarbohydrates()*4).toString()
                var cell3Text = findViewById<TextView>(R.id.text_table_row5_cell3)
                cell3Text.text = item.getProtein().toString()
                var cell4Text = findViewById<TextView>(R.id.text_table_row5_cell4)
                cell4Text.text = item.getFat().toString()
                var cell5Text = findViewById<TextView>(R.id.text_table_row5_cell5)
                cell5Text.text = item.getCarbohydrates().toString()
            }
            else if (i == 6) {
                var cell1Text = findViewById<TextView>(R.id.text_table_row6_cell1)
                cell1Text.text = item.getTitle()
                var cell2Text = findViewById<TextView>(R.id.text_table_row6_cell2)
                cell2Text.text = (item.getProtein()*4+item.getFat()*9+item.getCarbohydrates()*4).toString()
                var cell3Text = findViewById<TextView>(R.id.text_table_row6_cell3)
                cell3Text.text = item.getProtein().toString()
                var cell4Text = findViewById<TextView>(R.id.text_table_row6_cell4)
                cell4Text.text = item.getFat().toString()
                var cell5Text = findViewById<TextView>(R.id.text_table_row6_cell5)
                cell5Text.text = item.getCarbohydrates().toString()
            }
            else if (i == 7) {
                var cell1Text = findViewById<TextView>(R.id.text_table_row7_cell1)
                cell1Text.text = item.getTitle()
                var cell2Text = findViewById<TextView>(R.id.text_table_row7_cell2)
                cell2Text.text = (item.getProtein()*4+item.getFat()*9+item.getCarbohydrates()*4).toString()
                var cell3Text = findViewById<TextView>(R.id.text_table_row7_cell3)
                cell3Text.text = item.getProtein().toString()
                var cell4Text = findViewById<TextView>(R.id.text_table_row7_cell4)
                cell4Text.text = item.getFat().toString()
                var cell5Text = findViewById<TextView>(R.id.text_table_row7_cell5)
                cell5Text.text = item.getCarbohydrates().toString()
            }
            else if (i == 8) {
                var cell1Text = findViewById<TextView>(R.id.text_table_row8_cell1)
                cell1Text.text = item.getTitle()
                var cell2Text = findViewById<TextView>(R.id.text_table_row8_cell2)
                cell2Text.text = (item.getProtein()*4+item.getFat()*9+item.getCarbohydrates()*4).toString()
                var cell3Text = findViewById<TextView>(R.id.text_table_row8_cell3)
                cell3Text.text = item.getProtein().toString()
                var cell4Text = findViewById<TextView>(R.id.text_table_row8_cell4)
                cell4Text.text = item.getFat().toString()
                var cell5Text = findViewById<TextView>(R.id.text_table_row8_cell5)
                cell5Text.text = item.getCarbohydrates().toString()
            }
            else if (i == 9) {
                var cell1Text = findViewById<TextView>(R.id.text_table_row9_cell1)
                cell1Text.text = item.getTitle()
                var cell2Text = findViewById<TextView>(R.id.text_table_row9_cell2)
                cell2Text.text = (item.getProtein()*4+item.getFat()*9+item.getCarbohydrates()*4).toString()
                var cell3Text = findViewById<TextView>(R.id.text_table_row9_cell3)
                cell3Text.text = item.getProtein().toString()
                var cell4Text = findViewById<TextView>(R.id.text_table_row9_cell4)
                cell4Text.text = item.getFat().toString()
                var cell5Text = findViewById<TextView>(R.id.text_table_row9_cell5)
                cell5Text.text = item.getCarbohydrates().toString()
            }
            else if (i == 10) {
                var cell1Text = findViewById<TextView>(R.id.text_table_row10_cell1)
                cell1Text.text = item.getTitle()
                var cell2Text = findViewById<TextView>(R.id.text_table_row10_cell2)
                cell2Text.text = (item.getProtein()*4+item.getFat()*9+item.getCarbohydrates()*4).toString()
                var cell3Text = findViewById<TextView>(R.id.text_table_row10_cell3)
                cell3Text.text = item.getProtein().toString()
                var cell4Text = findViewById<TextView>(R.id.text_table_row10_cell4)
                cell4Text.text = item.getFat().toString()
                var cell5Text = findViewById<TextView>(R.id.text_table_row10_cell5)
                cell5Text.text = item.getCarbohydrates().toString()
            }
            else if (i == 11) {
                var cell1Text = findViewById<TextView>(R.id.text_table_row11_cell1)
                cell1Text.text = item.getTitle()
                var cell2Text = findViewById<TextView>(R.id.text_table_row11_cell2)
                cell2Text.text = (item.getProtein()*4+item.getFat()*9+item.getCarbohydrates()*4).toString()
                var cell3Text = findViewById<TextView>(R.id.text_table_row11_cell3)
                cell3Text.text = item.getProtein().toString()
                var cell4Text = findViewById<TextView>(R.id.text_table_row11_cell4)
                cell4Text.text = item.getFat().toString()
                var cell5Text = findViewById<TextView>(R.id.text_table_row11_cell5)
                cell5Text.text = item.getCarbohydrates().toString()
            }
            else if (i == 12) {
                var cell1Text = findViewById<TextView>(R.id.text_table_row12_cell1)
                cell1Text.text = item.getTitle()
                var cell2Text = findViewById<TextView>(R.id.text_table_row12_cell2)
                cell2Text.text = (item.getProtein()*4+item.getFat()*9+item.getCarbohydrates()*4).toString()
                var cell3Text = findViewById<TextView>(R.id.text_table_row12_cell3)
                cell3Text.text = item.getProtein().toString()
                var cell4Text = findViewById<TextView>(R.id.text_table_row12_cell4)
                cell4Text.text = item.getFat().toString()
                var cell5Text = findViewById<TextView>(R.id.text_table_row12_cell5)
                cell5Text.text = item.getCarbohydrates().toString()
            }
            i += 1
        }
    }
}