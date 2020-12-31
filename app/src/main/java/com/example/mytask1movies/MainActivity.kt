package com.example.mytask1movies

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity() {

    lateinit var mainfragment : MainFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mainfragment = MainFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment,mainfragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()

    }

    fun loadmain(frag1 : MainFragment){

        val ft =supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment, frag1)
        ft.commit()

    }

    fun loadmoviedetail(frag2 : MovieDetailFragment){

        val ft =supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment, frag2)
        ft.commit()

    }

    fun loadmovieticketbookme(frag3 : MovieTicketBookMeFragment){

        val ft =supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment, frag3)
        ft.commit()

    }


    fun click_movie_details(view: View?) {

        loadmoviedetail(MovieDetailFragment())

    }

    fun click_movie_ticket_book_me(view: View?) {

        loadmovieticketbookme(MovieTicketBookMeFragment())

    }


}