package com.example.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SQLLite : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sqllite)

        val vt= Veritabaiyardimci(this)
 kisilerdao().kisiEkle(vt,"ahmet","886889",6)

        val kisiListe = kisilerdao().tumkisiler(vt)
           for(k in kisiListe){
               Log.e("kisino",k.kisi_no.toString())
           }
    }
}