package com.example.mytask1movies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.RecyclerView

class MovieDetail : AppCompatActivity() {

    val items = arrayOf("CITY","ISLAMABAD", "LAHORE" , "KARACHI" , "GUJRANWALA")


    lateinit var CityNameAdapter : ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)


        val sp = findViewById<Spinner>(R.id.spinner_country_movie_detail)

        CityNameAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_item, items)

        CityNameAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        sp!!.setAdapter(CityNameAdapter)

//        spinner_country_movie_detail.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items)
//
//        spinner_country_movie_detail.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{}

    }

    fun click_movie_ticket_book_me(view: View?) {
        val intent = Intent(this@MovieDetail, MovieTicketBookMe::class.java)

        startActivity(intent)
    }

}