package com.example.threefragmentsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment = FirstFragment()
        val trans = supportFragmentManager.beginTransaction()
        trans.replace(R.id.fragment123, fragment)
        trans.commit()


    }
}