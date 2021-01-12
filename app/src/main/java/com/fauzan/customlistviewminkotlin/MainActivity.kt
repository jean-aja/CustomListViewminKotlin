package com.fauzan.customlistviewminkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.listView)

        var list = mutableListOf<Model>()

        list.add(Model("Adzkia", "Ini Bimbel Adzkia Stan..", R.drawable.adzkia))
        list.add(Model("GamaUI", "Ini Bimbel GamaUI..", R.drawable.gamaui))
        list.add(Model("Ganesha", "Ini Bimbel Ganesha..", R.drawable.ganesha))
        list.add(Model("Primagama", "Ini Bimbel Primagama..", R.drawable.primagama))
        list.add(Model("SCI", "Ini Bimbel SCI..", R.drawable.sci))
        listview.adapter = MyAdapter(mCtx = this, R.layout.row, list)
        listview.setOnItemClickListener{parent:AdapterView<*>, view:View, position:Int, id:Long ->
            if (position == 0){
                Toast.makeText(this@MainActivity, "You Click On Adzkia", Toast.LENGTH_LONG).show()
            }
            if (position == 1){
                Toast.makeText(this@MainActivity, "You Click On GamaUI", Toast.LENGTH_LONG).show()
            }
            if (position == 2){
                Toast.makeText(this@MainActivity, "You Click On Ganesha", Toast.LENGTH_LONG).show()
            }
            if (position == 3){
                Toast.makeText(this@MainActivity, "You Click On Primagama", Toast.LENGTH_LONG).show()
            }
            if (position == 4){
                Toast.makeText(this@MainActivity, "You Click On SCI", Toast.LENGTH_LONG).show()
            }
        }
    }
}
