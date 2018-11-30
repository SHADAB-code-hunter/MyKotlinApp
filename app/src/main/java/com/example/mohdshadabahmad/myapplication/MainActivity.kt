package com.example.mohdshadabahmad.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout


class MainActivity : AppCompatActivity() {
    private val handler = Handler()
    data class Person(val name: String, val age: Int)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        //creating our adapter

        /*   val progressTask = Runnable {
             runOnUiThread {
                Handler().postDelayed(Runnable {
                    myMethod()
                }, 5000)
            }
         }
        progressTask.run()*/
        var person = Person("Epic Games", 8)
        var list: MutableList<Person> = mutableListOf<Person>()
        list.add(person)

        val adapter = CustomAdapter(list)
        recyclerView.adapter = adapter
    }

    fun myMethod() {
        var person = Person("Epic Games", 8)
        var list: MutableList<Person> = mutableListOf<Person>()
        list.add(person)
    }

}



