package com.ilyashayrat.composeplaceholder.presentation.photos

import com.ilyashayrat.composeplaceholder.data.models.responseModels.ResponsePhoto

data class PhotosState(
    val isLoading : Boolean = false,
    val photo : List<ResponsePhoto>? = null,
    val error : String = ""
)
