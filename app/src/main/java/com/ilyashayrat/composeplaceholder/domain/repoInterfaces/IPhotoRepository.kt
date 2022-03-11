package com.ilyashayrat.composeplaceholder.domain.repoInterfaces

import com.ilyashayrat.composeplaceholder.data.models.responseModels.ResponseComments
import com.ilyashayrat.composeplaceholder.data.models.responseModels.ResponsePhoto

interface IPhotoRepository {
    suspend fun getPhotos() : List<ResponsePhoto>
    suspend fun getComments() : List<ResponseComments>
}