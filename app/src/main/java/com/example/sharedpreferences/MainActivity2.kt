package com.example.sharedpreferences

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val sp = getSharedPreferences("kisiselBilgiler", Context.MODE_PRIVATE)

        val ad =sp.getString("ad","isimyok")
        val yas =sp.getInt("yas",0)

        val arkadas = sp.getStringSet("arkadas",null)

        Log.e("Ad",ad!!)
        Log.e("Ad",yas.toString())

        if (arkadas != null) {
            for (a in arkadas){
                Log.e("arkadaş",a!!)
            }
        }
    }
}