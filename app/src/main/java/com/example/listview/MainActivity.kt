package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    var array = arrayOf("Snake","Lion","Tiger","Leopard","Cheetah","Elephant","Cub","Buffalo","Crocodile","Hippo","Giraffe","Warthog","Squirrel","Rat","Ant")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = ArrayAdapter(this,R.layout.list_item,array)
        val listView:ListView = findViewById(R.id.listview)
        listView.adapter=adapter

    }
}
