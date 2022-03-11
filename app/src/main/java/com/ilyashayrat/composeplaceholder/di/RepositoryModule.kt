package com.ilyashayrat.composeplaceholder.di

import com.ilyashayrat.composeplaceholder.data.remote.PlaceHolderService
import com.ilyashayrat.composeplaceholder.data.repo.PhotoRepository
import com.ilyashayrat.composeplaceholder.domain.repoInterfaces.IPhotoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun providePhotoRepo(api: PlaceHolderService) = PhotoRepository(api) as IPhotoRepository
}