package com.example.myapplicationnn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LambCategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lamb_category)

        val readmore1 = findViewById<TextView>(R.id.rm1)
        readmore1.setOnClickListener {
            val Intent = Intent (this,kapsalon_recipe::class.java)
            startActivity(Intent)

        }

        val readmore2 = findViewById<TextView>(R.id.rm2)
        readmore2.setOnClickListener {
            val Intent = Intent (this,keleyazaara_recipe::class.java)
            startActivity(Intent)

        }

        val readmore3 = findViewById<TextView>(R.id.rm3)
        readmore3.setOnClickListener {
            val Intent = Intent (this,lamblemonsouvlaki_recipe::class.java)
            startActivity(Intent)

        }

        val readmore4 = findViewById<TextView>(R.id.rm4)
        readmore4.setOnClickListener {
            val Intent = Intent (this,lambbiryani_recipe::class.java)
            startActivity(Intent)

        }
    }
}