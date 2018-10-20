package com.example.lei.droidconkot

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var CarList : ArrayList<K_Car> = ArrayList<K_Car>()
    var TruckList : ArrayList<K_Car> = ArrayList<K_Car>()
    var numLanes : Int = 0
    var road : String = ""

    lateinit var secondRoad : String

    //Exec4
    //var Names : ArrayList<String> = ArrayList<String>();


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        CarList = arrayListOf(K_Car("ASC123", "McLaren", false), K_Car("AS2123", "Veyron", false))
        secondRoad = "Pangalawang Road"
    }


}