package com.ilyashayrat.composeplaceholder.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ilyashayrat.composeplaceholder.domain.useCases.PhotoUseCase
import com.ilyashayrat.composeplaceholder.presentation.photos.CommentsState
import com.ilyashayrat.composeplaceholder.presentation.photos.PhotosState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PhotosViewModel @Inject constructor(private val photoUseCase: PhotoUseCase, private val savedStateHandle: SavedStateHandle) :
    ViewModel() {
    private val _photoState = mutableStateOf<PhotosState>(PhotosState())
    val photoState : State<PhotosState> = _photoState
    private val _commentState = mutableStateOf<CommentsState>(CommentsState())
    val commentState : State<CommentsState> = _commentState
    init {
        getPhotosFromAPI()
        getCommentFromAPI()
    }
    private fun getPhotosFromAPI(){
        viewModelScope.launch{
            _photoState.value = PhotosState(photo = photoUseCase.photoUseCase())
        }

    }

    private fun getCommentFromAPI(){
        viewModelScope.launch{
            _commentState.value = CommentsState(comment = photoUseCase.commentUseCase())
        }

    }
}