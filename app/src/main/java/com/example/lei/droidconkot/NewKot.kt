package com.example.lei.droidconkot

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_new_kot.*


//Implementation & Inheriting Class

class NewKot : AppCompatActivity(), View.OnClickListener{

    override fun onClick(p0: View?) {
        Toast.makeText(applicationContext, txtName.text.toString().displayWithEmoji(), Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_kot)
        btnClick.setOnClickListener(this)
    }



    //

}
