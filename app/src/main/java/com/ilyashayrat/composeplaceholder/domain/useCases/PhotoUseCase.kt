package com.ilyashayrat.composeplaceholder.domain.useCases


import com.ilyashayrat.composeplaceholder.data.models.responseModels.ResponseComments
import com.ilyashayrat.composeplaceholder.data.models.responseModels.ResponsePhoto
import com.ilyashayrat.composeplaceholder.domain.repoInterfaces.IPhotoRepository
import javax.inject.Inject

class PhotoUseCase @Inject constructor(private val photoRepository: IPhotoRepository) {
    suspend fun photoUseCase(): List<ResponsePhoto> {
        return photoRepository.getPhotos()
    }

    suspend fun commentUseCase(): List<ResponseComments> {
        return photoRepository.getComments()
    }
}