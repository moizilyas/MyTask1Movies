package com.example.mytask1movies

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController


class MainActivity : AppCompatActivity() {

    lateinit var mainfragment : HomeFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupActionBarWithNavController(findNavController(R.id.main_fragment))



//        mainfragment = HomeFragment()
//        supportFragmentManager.beginTransaction().replace(R.id.fragment,mainfragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()

    }

    override fun onSupportNavigateUp(): Boolean {

        val navController = findNavController(R.id.main_fragment)
        return navController.navigateUp() || super.onSupportNavigateUp()

    }

//    fun loadmain(frag1 : HomeFragment){
//
//        val ft =supportFragmentManager.beginTransaction()
//        ft.replace(R.id.fragment, frag1)
//        ft.commit()
//
//    }
//
//    fun loadmoviedetail(frag2 : MovieDetailFragment){
//
//        val ft =supportFragmentManager.beginTransaction()
//        ft.replace(R.id.fragment, frag2)
//        ft.commit()
//
//    }
//
//    fun loadmovieticketbookme(frag3 : MovieTicketBookMeFragment){
//
//        val ft =supportFragmentManager.beginTransaction()
//        ft.replace(R.id.fragment, frag3)
//        ft.commit()
//
//    }
//
//
//    fun click_movie_details(view: View?) {
//
//        loadmoviedetail(MovieDetailFragment())
//
//    }
//
//    fun click_movie_ticket_book_me(view: View?) {
//
//        loadmovieticketbookme(MovieTicketBookMeFragment())
//
//    }


}