package com.dgpay.lofo

object FoodData {

        private val foodNames = arrayOf("Lorem Food","Lorem Food","Lorem Food","Lorem Food","Lorem Food","Lorem Food")

        private val foodLocations = arrayOf("Location Food","Location Food","Location Food","Location Food","Location Food","Location Food")

        private val heroesImages = intArrayOf(R.drawable.potato,
            R.drawable.potato,
R.drawable.potato,
R.drawable.potato,
R.drawable.potato,
R.drawable.potato,

        )

        val listData: ArrayList<Food>
            get() {
                val list = arrayListOf<Food>()
                for (position in foodNames.indices) {
                    val hero = Food()
                    hero.name = foodNames[position]
                    hero.location = foodLocations[position]
                    hero.photo = heroesImages[position]
                    list.add(hero)
                }
                return list
            }

}