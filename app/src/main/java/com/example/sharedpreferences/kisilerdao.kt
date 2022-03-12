package com.example.sharedpreferences

import android.annotation.SuppressLint
import android.content.ContentValues

//veritabanı işlemleri select insert
class kisilerdao {

fun kisiEkle(vt:Veritabaiyardimci,kisi_ad:String,kisi_tel:String,kisi_yas:Int){
    val db =vt.writableDatabase
   val values = ContentValues()
   values.put("kisi_ad",kisi_ad)
    values.put("kisi_tel",kisi_tel)
    values.put("kisi_yas",kisi_yas)
    db.insertOrThrow("kisiler",null,values)
      db.close()
}

    @SuppressLint("Range")
    fun tumkisiler(vt:Veritabaiyardimci):ArrayList<Kisiler>{
        val kisilerArraylist =ArrayList<Kisiler>()
        val db =vt.writableDatabase
        val cursor =db.rawQuery("SELECT * FROM kisiler",null)
        while (cursor.moveToNext()){
            val kisi =Kisiler(cursor.getInt(cursor.getColumnIndex("kisi_no")),
            cursor.getString(cursor.getColumnIndex("kisi_ad")),
            cursor.getString(cursor.getColumnIndex("kisi_tel")),
            cursor.getInt(cursor.getColumnIndex("kisi_yas "))
                )
            kisilerArraylist.add(kisi)
        }
        return kisilerArraylist
    }

}