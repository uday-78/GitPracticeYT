package com.example.gitpracticeyt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("This is contained in my second commit")
        println("Changes Made by friend")
        println("CHANGE 4")
        println("This line will be merged")
    }
}