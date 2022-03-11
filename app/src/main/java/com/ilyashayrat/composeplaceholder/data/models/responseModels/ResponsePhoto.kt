package com.ilyashayrat.composeplaceholder.data.models.responseModels

import com.google.gson.annotations.SerializedName

data class ResponsePhoto(
    @SerializedName("albumId") //Alltaki albumId ile aynı işlevi görüyor(API'den gelen değeri maplemeye yarıyor)
    val albumId : Int,
    val id : Int,
    val title : String,
    val url : String,
    val thumbnailUrl : String
)



