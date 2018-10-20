package com.example.lei.droidconkot

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Exec4
    var Names : ArrayList<String> = ArrayList<String>();


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Names = arrayListOf("Lei", "Eden", "Meow");

        
        for(N in Names) {
            test.text = ("${test.text.toString()} \nName: $N -> Gender: ${getGender(N)}" )
        }

    }

    fun getGender(n : String) : String {
        when(n) {
            "Lei" -> {
                return "Male"
            }
            "Eden" -> {
                return "Female"
            }
        }


        return "Unknown"
    }


}

