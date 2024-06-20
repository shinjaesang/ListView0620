package kr.ac.listviewtest0620

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var  imgv : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = findViewById<ListView>(R.id.list)
        imgv = findViewById<ImageView>(R.id.imgv)

        var items = arrayOf("별", "달", "태양", "목성", "토성", "화성", "금성")
        var imgRes = arrayOf(R.drawable.star, R.drawable.moon, R.drawable.sun, R.drawable.jupiter, R.drawable.saturn, R.drawable.masr, R.drawable.venus)

        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items)
        list.adapter = adapter

        list.setOnItemClickListener { parent, view, position, id ->
            imgv.setImageResource(imgRes[position])
            Toast.makeText(applicationContext, items[position] + "는(은) 정말 이뻐요~", Toast.LENGTH_SHORT).show()
        }
    }
}