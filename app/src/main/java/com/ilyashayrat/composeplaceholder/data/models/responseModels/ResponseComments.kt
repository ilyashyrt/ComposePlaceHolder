package com.ilyashayrat.composeplaceholder.data.models.responseModels

data class ResponseComments(
    val postId : Int,
    val id : Int,
    val name : String,
    val email : String,
    val body : String
)