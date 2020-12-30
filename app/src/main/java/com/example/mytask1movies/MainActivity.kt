package com.example.mytask1movies

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mytask1movies.adapters.ImageAdapter
import com.example.mytask1movies.adapters.TimelineImageAdapter


class MainActivity : AppCompatActivity() {


//    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
//        super.onCreate(savedInstanceState, persistentState)
//
//        fun loadfrag(frag : MainFragment){
//
//
//        }
//
//    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radio=findViewById<RadioGroup>(R.id.radioGroup)
        radio.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.now_showing -> {
                    Toast.makeText(this, "Now showing", Toast.LENGTH_LONG).show()
                }
                R.id.coming_soon -> {
                    Toast.makeText(this, "Coming soon", Toast.LENGTH_LONG).show()
                }
                R.id.cinema -> {
                    Toast.makeText(this, "Cinema", Toast.LENGTH_LONG).show()
                }
            }
        })

        val users: ArrayList<String> = ArrayList()

        for(i in 1..100){
            users.add("MOiz ILYas #$i")
        }







//        RecyclerView1.apply {
//            // set a LinearLayoutManager to handle Android
//            // RecyclerView behavior
//            layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
//            // set the custom adapter to the RecyclerView
//            adapter = UsersAdapter(users)
//        }

        val images = listOf<Image>(
            Image("Image 1", R.drawable.img1),
            Image("Image 2", R.drawable.img2),
            Image("Image 3", R.drawable.img3),
            Image("Image 4", R.drawable.img4),
            Image("Image 5", R.drawable.img5)
        )


        val RecyclerView1 = findViewById<RecyclerView>(R.id.RecyclerView1)

        RecyclerView1.layoutManager = LinearLayoutManager(
            applicationContext,
            LinearLayoutManager.HORIZONTAL,
            false
        )
//        RecyclerView1.layoutManager = LinearLayoutManager(this)
        RecyclerView1.setHasFixedSize(true)
        RecyclerView1.adapter = TimelineImageAdapter(this, images)


        val grid_images = listOf<Image>(
            Image("CUBE", R.drawable.gimg1),
            Image("LEON", R.drawable.gimg2),
            Image("THE NEXT THREE DAYS", R.drawable.gimg3),
            Image("BEETLEJUICE", R.drawable.gimg4),
            Image("UNIVERSAL MONSTERS", R.drawable.gimg5),
            Image("FRAKENSTEIN", R.drawable.gimg6),
            Image("SONIC", R.drawable.gimg7),
            Image("SCREAM", R.drawable.gimg8),
            Image("FREDDY'S DEAD", R.drawable.gimg9),
            Image("THE EYES OF MY MOTHER", R.drawable.gimg10),
            Image("DISNEY", R.drawable.gimg11),
            Image("FAST & FURIOUS", R.drawable.gimg12),
            Image("SUNSHINE", R.drawable.gimg13),
            Image("2.0", R.drawable.gimg14)

        )

        val RecyclerView2 = findViewById<RecyclerView>(R.id.RecyclerView2)

        RecyclerView2.layoutManager = GridLayoutManager(getApplicationContext(), 3)
//        RecyclerView2.layoutManager = LinearLayoutManager(this)
        RecyclerView2.setHasFixedSize(true)
        RecyclerView2.adapter = ImageAdapter(this, grid_images)

    }

    fun click_movie_details(view: View?) {
        val intent = Intent(this@MainActivity, MovieDetail::class.java)

        startActivity(intent)
    }

}