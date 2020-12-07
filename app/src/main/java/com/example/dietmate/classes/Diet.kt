package com.example.dietmate.classes

import android.os.Parcel
import java.io.Serializable

class Diet() : Serializable {

    private var dietType: Int = 0
    private var age: Int = 0
    private var gender: Int = 0
    private var height: Int = 0
    private var weight: Int = 0
    private var activityLevel: Int = 0
    private var weightlifter: Boolean = false
    private var calorieBreakdown: CalorieBreakdown? = null

    fun setDietType(newDietType:Int){
        when(newDietType){
            0 -> this.dietType = 0 //Lose Weight Fast
            1 -> this.dietType = 1 //Lose Weight
            2 -> this.dietType = 2 //Maintain Weight
            3 -> this.dietType = 3 //Gain Weight
            4 -> this.dietType = 4 //Gain Weight Fast
            else -> this.dietType = 5 //Invalid???
        }
    }

    fun setAge(newAge:Int){
        this.age = newAge
    }

    fun setGender(newGender:Int){
        when(newGender){
            0 -> this.gender = 0 //Male
            1 -> this.gender = 1 //Female
            else -> this.gender = 3 //Invalid???
        }
    }

    fun setHeight(newHeight:Int){
        this.height = newHeight
    }

    fun setWeight(newWeight:Int){
        this.weight = newWeight
    }

    fun setActivityLevel(newActivityLevel:Int){
        this.activityLevel = newActivityLevel
    }

    fun setWeightlifter(newWeightlifter:Boolean){
        this.weightlifter = newWeightlifter
    }

    fun setCalorieBreakdown (newCalorieBreakdown: CalorieBreakdown){
        this.calorieBreakdown = newCalorieBreakdown
    }

    fun getDietType() : Int {
        return this.dietType
    }

    fun getAge(): Int {
        return this.age
    }

    fun getGender(): Int {
        return this.gender
    }

    fun getHeight(): Int {
        return this.height
    }

    fun getWeight(): Int {
        return this.weight
    }

    fun getActivityLevel(): Int {
        return this.activityLevel
    }

    fun getWeightlifter() : Boolean {
        return this.weightlifter
    }

    fun getCalorieBreakdown() : CalorieBreakdown? {
        return this.calorieBreakdown
    }
}