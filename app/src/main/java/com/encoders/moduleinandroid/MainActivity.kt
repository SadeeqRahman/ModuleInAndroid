package com.encoders.moduleinandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.encoders.myutils.Utils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mybutton = findViewById<Button>(R.id.mybutton)
        mybutton.setOnClickListener {
            val utils: Utils = Utils()
            utils.ShowToast(this)
        }
    }
}