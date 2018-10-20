package com.example.lei.droidconkot

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //basketPlayers = arrayListOf<String>("Josh", "Lei", "Kath")
        //elvis operator = <?>  if null don't crash :V [hahahahaha]
        plate_number.setText(basketPlayers?.get(0))
    }

    //Must have default value since it was considered as primitive (SABI NI MAM)
    var homeCourt : Boolean = false

    //lateinit  -> will create or set default value when onCreate()
    lateinit var basketballTeam : String
    lateinit var color1: String
    lateinit var color2: String

    //Is Nullable
    var basketPlayers : ArrayList<String>? = null

}