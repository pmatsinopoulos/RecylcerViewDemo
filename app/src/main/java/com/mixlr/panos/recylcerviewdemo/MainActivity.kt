package com.mixlr.panos.recylcerviewdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val fruitsList = listOf<Fruit>(
        Fruit("Mango", "Joe"),
        Fruit("Apple", "Frank"),
        Fruit("Banana", "Tom"),
        Fruit("Guava", "Joe"),
        Fruit("Lemon", "Alex"),
        Fruit("Pear", "Joe"),
        Fruit("Orange", "Alex"),
        Fruit("Mellon", "Peter"),
        Fruit("Watermelon", "Tom"),
        Fruit("Carrot", "Peter")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.myRecyclerView)
        rv.setBackgroundColor(Color.YELLOW)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = MyRecyclerViewAdapter(fruitsList) { selectedItem: Fruit ->
            listItemClicked(selectedItem)
        }
    }

    private fun listItemClicked(fruit: Fruit) {
        Toast.makeText(this@MainActivity,
            "Supplier Name is: ${fruit.supplier}", Toast.LENGTH_LONG).show()
    }
}