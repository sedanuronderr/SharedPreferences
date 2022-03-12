package com.example.sharedpreferences

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class Veritabaiyardimci(context: Context) :SQLiteOpenHelper(context,"rehber",null,1){
    override fun onCreate(db: SQLiteDatabase?) {
     //tablo tanımlaması oluşturma
       db?.execSQL("CREATE TABLE kisiler (kisi_no INTEGER PRIMARY KEY AUTOINCREMENT," +
               "kisi_adi TEXT,kisi_tel TEXT,kisi_yas INTEGER);")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
      db?.execSQL("DROP TABLE IF EXISTS kisiler")
        onCreate(db)
    }
}