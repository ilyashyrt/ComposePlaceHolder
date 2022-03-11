package com.ilyashayrat.composeplaceholder.di

import com.ilyashayrat.composeplaceholder.data.remote.PlaceHolderService
import com.ilyashayrat.composeplaceholder.data.repo.PhotoRepository
import com.ilyashayrat.composeplaceholder.domain.repoInterfaces.IPhotoRepository
import com.ilyashayrat.composeplaceholder.domain.useCases.PhotoUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Singleton
    @Provides
    fun providePhotoUseCase(repository: IPhotoRepository) = PhotoUseCase(repository)
}