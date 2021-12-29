package com.alamazing.travel

import PlaceAdapter
import TravelBuddyAdapter
import TravelBuddyModel
import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeActivity : AppCompatActivity() {

    lateinit var gridView: GridView
    private var placeImages =
        intArrayOf(
            R.drawable.japan,
            R.drawable.barcelona,
            R.drawable.greece,
            R.drawable.rome,
            R.drawable.japan,
            R.drawable.barcelona)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        gridView = findViewById(R.id.idGVcourses);
        val adapter = PlaceAdapter(this, placeImages)
        gridView.adapter = adapter

        val subjectArrayList: ArrayList<TravelBuddyModel> = ArrayList()
        subjectArrayList.add(TravelBuddyModel("", R.drawable.add, 27))
        subjectArrayList.add(TravelBuddyModel("", R.drawable.ashok, 13))
        subjectArrayList.add(TravelBuddyModel("", R.drawable.jack, 45))

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val travelAdapter = TravelBuddyAdapter(subjectArrayList)
        recyclerView.adapter = travelAdapter
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
    }
}
