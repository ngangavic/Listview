package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var array = arrayOf("Snake","Lion","Tiger","Leopard","Cheetah","Elephant","Cub","Buffalo","Crocodile","Hippo","Giraffe","Warthog","Squirrel","Rat","Ant")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = ArrayAdapter(this,R.layout.list_item,array)
        val listView:ListView = findViewById(R.id.listview)
        listView.adapter=adapter
        listView.onItemClickListener = object: AdapterView.OnItemClickListener{
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
               val itemValue = listView.getItemAtPosition(position)
                Toast.makeText(applicationContext,"Position $position \n Value: $itemValue",Toast.LENGTH_SHORT).show();
            }
        }

    }
}
