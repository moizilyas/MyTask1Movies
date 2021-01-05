package com.example.mytask1movies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_movie_ticket_book_me.*


class MovieTicketBookMeFragment : Fragment() {

    private val args by navArgs<MovieTicketBookMeFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v : View = inflater.inflate(R.layout.fragment_movie_ticket_book_me, container, false)



        return v

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        cinema_city_name_ticket_book_me.text = args.bookingDetails.city_name
        title_movie_book_me.text = args.bookingDetails.movie_name


    }


}