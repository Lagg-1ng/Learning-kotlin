package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    var counter = 0
    lateinit var messedj : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        counter = 5 + 6
        Log.d("MyLogMact","onCreate1")
        Log.d("MyLogMact","onCreate2")
       // val textureView = findViewById<TextView>(R.id.textView)
        messedj.text = "privet Lorem Ipsum"
    }

    override fun onStart() {
        super.onStart()
        Log.d("MyLogMact","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyLogMact","onResume")
    }

    override fun onPause() {
        super.onPause()
        counter *= 2
        Log.d("MyLogMact","onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLogMact","onDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLogMact","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyLogMact","onRestart")
    }

    fun onClickTset(view : View){
        setContentView(R.layout.activity_main)
    }
}