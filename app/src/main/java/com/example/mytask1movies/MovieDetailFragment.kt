package com.example.mytask1movies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.mytask1movies.R


class MovieDetailFragment : Fragment() {


    val items = arrayOf("CITY","ISLAMABAD", "LAHORE" , "KARACHI" , "GUJRANWALA")


    lateinit var CityNameAdapter : ArrayAdapter<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v : View = inflater.inflate(R.layout.fragment_movie_detail, container, false)


        val sp = v.findViewById<Spinner>(R.id.spinner_country_movie_detail)

        activity?.let { ArrayAdapter(it, android.R.layout.simple_spinner_item, items).also { CityNameAdapter = it } }

        CityNameAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        sp!!.setAdapter(CityNameAdapter)

//        spinner_country_movie_detail.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items)
//
//        spinner_country_movie_detail.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{}


        return v
    }


}