package com.example.mytask1movies.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mytask1movies.data.model.Image
import com.example.mytask1movies.R

class ImageAdapter(
    private val context: Context,
    private val images: List <Image>
): RecyclerView.Adapter<ImageAdapter.ImageViewHolder>(){

    class ImageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val img : ImageView = itemView.findViewById<ImageView>(R.id.image)
        val imgTitle : TextView = itemView.findViewById<TextView>(R.id.image_title)
        fun bindView(image: Image) {
            img.setImageResource(image.imageSrc)
            imgTitle.text =image.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.item_images,parent,false))

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(images[position])
    }

}

