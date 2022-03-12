package com.example.sharedpreferences

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sp = getSharedPreferences("kisiselBilgiler", Context.MODE_PRIVATE)

        val editor =sp.edit()

        editor.putString("ad","Ahmet")
        editor.putInt("yas",18)
        /*******************************/
        val arkadaslistesi =HashSet<String>()
        arkadaslistesi.add("zeynep")
        arkadaslistesi.add("mehmet")

        editor.putStringSet("arkadas",arkadaslistesi)
        editor.commit()

button.setOnClickListener {
    startActivity(Intent(this,MainActivity2::class.java))
}
    }
}