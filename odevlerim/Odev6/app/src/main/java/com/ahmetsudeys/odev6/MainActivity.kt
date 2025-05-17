package com.ahmetsudeys.odev6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var songAdapter: SongAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerViewSongs)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val songList = listOf(
            Song("Aşkın Olayım", "Simge", R.drawable.askin_olayim),
            Song("Antidepresan", "Mert Demir & Mabel Matiz", R.drawable.antidepresan),
            Song("Yana Yana", "Semicenk", R.drawable.yana_yana),
            Song("Sakiler", "Dünyadan Uzak", R.drawable.sakiler),
            Song("Kahretsin", "Emir Can İğrek", R.drawable.kahretsin),
            Song("Bi' Tek Ben Anlarım", "KÖFN", R.drawable.birtekbenanlarim),
            Song("Aşkımız Olay Olacak", "Derya Uluğ", R.drawable.askimizolayolacak),
            Song("Seninle Olmaz", "Zeynep Bastık", R.drawable.seninleolmaz),
            Song("Çok Sevmek Yasaklanmalı", "Sezen Aksu", R.drawable.coksevmek),
            Song("Yorgun", "Mor ve Ötesi", R.drawable.yorgun),
            Song("Neyim Var Ki", "Ceza & Sagopa", R.drawable.neyimvarki),
            Song("Ben Yoruldum Hayat", "Mümin Sarıkaya", R.drawable.benyoruldum)
        )

        songAdapter = SongAdapter(songList)
        recyclerView.adapter = songAdapter

        //val toolbar = findViewById<MaterialToolbar>(R.id.topAppBar)
        val inflater = layoutInflater
        val searchView = inflater.inflate(R.layout.toolbar_search, null)
        //toolbar.addView(searchView)



    }
}
