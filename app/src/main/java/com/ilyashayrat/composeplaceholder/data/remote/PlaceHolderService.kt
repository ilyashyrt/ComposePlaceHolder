package com.ilyashayrat.composeplaceholder.data.remote

import com.ilyashayrat.composeplaceholder.application.constants.ApplicationNetworkConstants.CONSTANT_COMMENTS
import com.ilyashayrat.composeplaceholder.application.constants.ApplicationNetworkConstants.CONSTANT_PHOTOS
import com.ilyashayrat.composeplaceholder.data.models.responseModels.ResponseComments
import com.ilyashayrat.composeplaceholder.data.models.responseModels.ResponsePhoto
import retrofit2.http.GET

interface PlaceHolderService {
    @GET(CONSTANT_PHOTOS)
    suspend fun getPhotos() : List<ResponsePhoto>

    @GET(CONSTANT_COMMENTS)
    suspend fun getComments() : List<ResponseComments>
}