package com.example.mytask1movies.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.mytask1movies.data.model.Image
import com.example.mytask1movies.R

public class TimelineImageAdapter (
    private val context: Context,
    private val timeline_images: List <Image>
): RecyclerView.Adapter<TimelineImageAdapter.ImageViewHolder> () {

    class ImageViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        val img : ImageView = itemView.findViewById<ImageView>(R.id.timeline_image)
        fun bindView(timeline_image: Image) {
            img.setImageResource(timeline_image.imageSrc)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.timeline_images,parent,false))

    override fun getItemCount(): Int = timeline_images.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(timeline_images[position])
    }

}