package com.ilyashayrat.composeplaceholder.data.repo

import com.ilyashayrat.composeplaceholder.data.models.responseModels.ResponseComments
import com.ilyashayrat.composeplaceholder.data.models.responseModels.ResponsePhoto
import com.ilyashayrat.composeplaceholder.data.remote.PlaceHolderService
import com.ilyashayrat.composeplaceholder.domain.repoInterfaces.IPhotoRepository
import javax.inject.Inject

class PhotoRepository @Inject constructor(private val placeHolderService : PlaceHolderService) : IPhotoRepository{
    override suspend fun getPhotos(): List<ResponsePhoto> {
        return placeHolderService.getPhotos()
    }

    override suspend fun getComments(): List<ResponseComments> {
        return placeHolderService.getComments()
    }
}