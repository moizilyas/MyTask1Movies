package com.example.mytask1movies

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.example.mytask1movies.R


class MovieDetailFragment : Fragment(), AdapterView.OnItemSelectedListener {


    lateinit var v : View
    lateinit var spinner_city : Spinner
    lateinit var city_selected : String
    lateinit var movie_title : TextView

    val items = arrayOf("CITY","ISLAMABAD", "LAHORE" , "KARACHI" , "GUJRANWALA")


    lateinit var CityNameAdapter : ArrayAdapter<String>

    @SuppressLint("CutPasteId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_movie_detail, container, false)

        movie_title = v.findViewById(R.id.title_movie_details)

        val sp = v.findViewById<Spinner>(R.id.spinner_country_movie_detail)

        activity?.let { ArrayAdapter(it, android.R.layout.simple_spinner_item, items).also { CityNameAdapter = it } }

        CityNameAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        sp!!.adapter = CityNameAdapter

        spinner_city = v.findViewById(R.id.spinner_country_movie_detail)





        spinner_city.adapter =
            activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,items) }

        spinner_city.onItemSelectedListener = this

        return v
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val text: String = parent?.getItemAtPosition(position).toString()
        city_selected = text
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val button1 = v.findViewById<Button>(R.id.cinema1_button1)

        button1.setOnClickListener{
            val city_name = city_selected
            val movie_name = movie_title.text

            val details = Details(city_name, movie_name as String)

            val action : NavDirections  = MovieDetailFragmentDirections.actionMovieDetailFragmentToMovieTicketBookMeFragment(details, "Islamabad","Movie Title")

            findNavController().navigate(action)
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