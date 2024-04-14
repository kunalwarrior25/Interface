package com.example.testingop.movie

import android.os.Parcel
import android.os.Parcelable

data class movie_modle(
    var movie_image:Int,
    var movie_name: String?,
    var movie_released_date: String?,
    var movie_released_by: String?
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(movie_image)
        parcel.writeString(movie_name)
        parcel.writeString(movie_released_date)
        parcel.writeString(movie_released_by)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<movie_modle> {
        override fun createFromParcel(parcel: Parcel): movie_modle {
            return movie_modle(parcel)
        }

        override fun newArray(size: Int): Array<movie_modle?> {
            return arrayOfNulls(size)
        }
    }
}