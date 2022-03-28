package com.dgpay.lofo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView




class MainActivity : AppCompatActivity() {
    private lateinit var rvFoods: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        rvFoods = findViewById(R.id.rv_foods)
        rvFoods.setHasFixedSize(true)
        list.addAll(FoodData.listData)
        showRecyclerGrid()
    }

    private fun showRecyclerGrid() {
        rvFoods.layoutManager = GridLayoutManager(this, 2)
        val gridHeroAdapter = GridFragmentAdapter(list)
        rvFoods.adapter = gridHeroAdapter
    }

    private fun showRecyclerList() {
        rvFoods.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListFoodAdapter(list)
        rvFoods.adapter = listHeroAdapter
    }


}