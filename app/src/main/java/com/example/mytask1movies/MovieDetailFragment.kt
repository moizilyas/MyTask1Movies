package com.example.mytask1movies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.navigation.fragment.findNavController
import com.example.mytask1movies.R


class MovieDetailFragment : Fragment() {


    lateinit var v : View

    val items = arrayOf("CITY","ISLAMABAD", "LAHORE" , "KARACHI" , "GUJRANWALA")


    lateinit var CityNameAdapter : ArrayAdapter<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_movie_detail, container, false)


        val sp = v.findViewById<Spinner>(R.id.spinner_country_movie_detail)

        activity?.let { ArrayAdapter(it, android.R.layout.simple_spinner_item, items).also { CityNameAdapter = it } }

        CityNameAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        sp!!.setAdapter(CityNameAdapter)

//        spinner_country_movie_detail.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items)
//
//        spinner_country_movie_detail.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{}


        return v
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val button1 = v.findViewById<Button>(R.id.cinema1_button1)

        button1.setOnClickListener{
            findNavController().navigate(R.id.action_movieDetailFragment_to_movieTicketBookMeFragment)
        }

        val button2 = v.findViewById<Button>(R.id.cinema1_button2)

        button2.setOnClickListener{
            findNavController().navigate(R.id.action_movieDetailFragment_to_movieTicketBookMeFragment)
        }

        val button3 = v.findViewById<Button>(R.id.cinema2_button1)

        button3.setOnClickListener{
            findNavController().navigate(R.id.action_movieDetailFragment_to_movieTicketBookMeFragment)
        }

        val button4 = v.findViewById<Button>(R.id.cinema2_button2)

        button4.setOnClickListener{
            findNavController().navigate(R.id.action_movieDetailFragment_to_movieTicketBookMeFragment)
        }

        val button5 = v.findViewById<Button>(R.id.cinema2_button3)

        button5.setOnClickListener{
            findNavController().navigate(R.id.action_movieDetailFragment_to_movieTicketBookMeFragment)
        }

        val button6 = v.findViewById<Button>(R.id.cinema2_button4)

        button6.setOnClickListener{
            findNavController().navigate(R.id.action_movieDetailFragment_to_movieTicketBookMeFragment)
        }
    }



}