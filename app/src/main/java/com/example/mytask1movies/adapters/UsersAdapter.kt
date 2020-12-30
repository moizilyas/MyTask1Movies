package com.example.mytask1movies.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mytask1movies.R

class UsersAdapter(val users: ArrayList<String>) : RecyclerView.Adapter<UsersAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.user_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.firstName.text = users[position]
    }

    override fun getItemCount() = users.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val firstName: TextView = itemView.findViewById(R.id.firstName)
    }


}