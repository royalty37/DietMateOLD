package com.example.dietmate.classes

import android.os.Parcel
import java.io.Serializable

class Diet() : Serializable {

    private var dietType: Int = 0 //Goals
    private var age: Int = 0
    private var gender: Int = 0
    private var height: Int = 0
    private var weight: Int = 0
    private var activityLevel: Int = 0
    private var weightlifter: Boolean = false
    private var overweight: Boolean = false
    private var protein:Int = 0
    private var carbohydrates:Int = 0
    private var fat:Int = 0
    private var calories:Int = 0
    private var myFoods : ArrayList<food> = ArrayList<food>()

    class food(newProtein: Int, newFat: Int, newCarbohydrates: Int, newTitle: String) {
        private var title: String = newTitle
        private var protein: Int = newProtein
        private var fat: Int = newFat
        private var carbohydrates: Int = newCarbohydrates
        //private var sourceOf: Char = newSourceOf

        fun getProtein(): Int{
            return this.protein
        }

        fun getFat(): Int{
            return this.fat
        }

        fun getCarbohydrates(): Int{
            return this.carbohydrates
        }

        fun getTitle() : String {
            return title
        }
    }

    fun setDietType(newDietType:Int){
        this.dietType = newDietType
    }

    fun setAge(newAge:Int){
        this.age = newAge
    }

    fun setGender(newGender:Int){
        this.gender = newGender
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

    fun setOverweight(newOverweight:Boolean){
        this.overweight = newOverweight
    }

    fun setProtein(newProtein:Int){
        this.protein = newProtein
    }

    fun setCarbohydrates(newCarbohydrates:Int){
        this.carbohydrates = newCarbohydrates
    }

    fun setFat(newFat:Int){
        this.fat = newFat
    }

    fun setCalories(newCalories:Int){
        this.calories = newCalories
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

    fun getOverweight() : Boolean {
        return this.overweight
    }

    fun getProtein() : Int {
        return this.protein
    }

    fun getCarbohydrates() : Int {
        return this.carbohydrates
    }

    fun getFat() : Int {
        return this.fat
    }

    fun getCalories() : Int {
        return this.calories
    }

    fun getMyFoods() : ArrayList<food> {
        return this.myFoods
    }

    fun generateCalorieBreakdown() {
        var genderS = 5
        if (this.gender == 1)
            genderS = -161
        val bmr : Double = 10*this.weight+6.25*this.height-5*this.age+genderS

        var activityLevelCalories = 0.0
        when (this.activityLevel) {
            0 -> activityLevelCalories = (bmr*1.2)
            1 -> activityLevelCalories = (bmr*1.37)
            2 -> activityLevelCalories = (bmr*1.46)
            3 -> activityLevelCalories = (bmr*1.54)
            4 -> activityLevelCalories = (bmr*1.72)
            5 -> activityLevelCalories = (bmr*1.89)
        }

        when (this.dietType) {
            0 -> this.calories = (activityLevelCalories - 1000).toInt()
            1 -> this.calories = (activityLevelCalories - 500).toInt()
            2 -> this.calories = activityLevelCalories.toInt()
            3 -> this.calories = (activityLevelCalories + 500).toInt()
            4 -> this.calories = (activityLevelCalories + 1000).toInt()
        }

        //Protein
        if (this.overweight == true){
            if (this.weightlifter == true)
                this.protein = (1.5*this.weight).toInt()
            else
                this.protein = (1.2*this.weight).toInt()
        }
        else if (this.weightlifter == true) {
            if (this.dietType == 0 || this.dietType == 1)
                this.protein = (2.4*this.weight).toInt()
            else if (this.dietType == 3)
                this.protein = (1.6*this.weight).toInt()
            else
                this.protein = 2*this.weight
        }
        else
            this.protein = (1.4*this.weight).toInt()
        //Fat
        this.fat = (0.88*this.weight).toInt()

        //Carbohydrates
        this.carbohydrates = ((this.calories-(this.protein*4+this.fat*9))/4).toInt()
    }

    fun generateFoodList() {
        val newFoodList = ArrayList<food>()

        var remainingProtein : Int = this.protein
        var remainingFat : Int = this.fat
        var remainingCarbohydrates : Int = this.carbohydrates

        if (remainingProtein > 62) {
            val chickenBreast= food(62, 4, 0, "200g Chicken Breast")
            newFoodList.add(chickenBreast)
            remainingProtein -= 62
            remainingFat -= 4
            remainingCarbohydrates -=0
        }

        if (remainingProtein > 32) {
            val milk = food(32, 32, 48, "4 cups of Whole Milk")
            newFoodList.add(milk)
            remainingProtein -= 16
            remainingFat -= 16
            remainingCarbohydrates -= 24
        }
        else if (remainingProtein > 16) {
            var milk = food(16, 16, 24, "2 cups of Whole Milk")
            newFoodList.add(milk)
            remainingProtein -= 16
            remainingFat -= 16
            remainingCarbohydrates -= 24
        }
        else if (remainingProtein > 8) {
            var milk= food(8, 8, 12, "1 cup of Whole Milk")
            newFoodList.add(milk)
            remainingProtein -= 8
            remainingFat -= 8
            remainingCarbohydrates -= 12
        }

        if(remainingProtein > 10) {
            val ratio = remainingProtein/21
            val amountOfAlmonds = (100*ratio).toString()
            val almonds = food(
                (ratio*21).toInt(),
                (ratio*50).toInt(),
                (ratio*22).toInt(),
                amountOfAlmonds+"g of Almonds")
            newFoodList.add(almonds)
            remainingProtein -= (ratio*21).toInt()
            remainingFat -= (ratio*50).toInt()
            remainingCarbohydrates -= (ratio*22).toInt()
        }

        if (remainingCarbohydrates > 10) {
            val ratio = remainingCarbohydrates / 17
            val amountOfPotatoes = (100 * ratio).toString()
            val potatoes = food(
                (ratio * 2).toInt(),
                (ratio * 0.1).toInt(),
                (ratio * 17).toInt(),
                amountOfPotatoes + "g of Potatoes"
            )
            newFoodList.add(potatoes)
            remainingProtein -= (ratio * 2).toInt()
            remainingFat -= (ratio * 0.1).toInt()
            remainingCarbohydrates -= (ratio*17).toInt()
        }

        myFoods = newFoodList
    }
}