package com.ilyashayrat.composeplaceholder.presentation.photos

import com.ilyashayrat.composeplaceholder.data.models.responseModels.ResponseComments
import com.ilyashayrat.composeplaceholder.data.models.responseModels.ResponsePhoto

data class CommentsState(
    val isLoading : Boolean = false,
    val comment : List<ResponseComments>? = null,
    val error : String = ""
)