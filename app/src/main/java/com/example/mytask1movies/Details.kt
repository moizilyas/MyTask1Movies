package com.example.mytask1movies

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Details(val city_name : String, val movie_name : String) : Parcelable{

}
