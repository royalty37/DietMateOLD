package com.example.dietmate.classes

import java.io.Serializable

class CalorieBreakdown : Serializable {

    private var protein:Int = 0
    private var carbohydrates:Int = 0
    private var fat:Int = 0
    private var calories:Int = 0

    fun setProtein(newProtein:Int){
        this.protein = newProtein
    }

    fun setCarbohydrates(newCarbohydrates:Int){
        this.carbohydrates = newCarbohydrates
    }

    fun setFat(newFat:Int){
        this.fat = newFat
    }

    fun setCalories(){
        this.calories = this.protein*4 + this.carbohydrates*4 + this.fat*9
    }
}