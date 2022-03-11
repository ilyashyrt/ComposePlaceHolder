package com.ilyashayrat.composeplaceholder.presentation.photos.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ilyashayrat.composeplaceholder.presentation.PhotosViewModel


@Composable
fun PhotoScreen(photosViewModel: PhotosViewModel = hiltViewModel()){
    val photoState = photosViewModel.photoState.value
    val commentState = photosViewModel.commentState.value

    Column() {
        photoState.photo?.let {
            Text(text = "${it[0].title}")
        }
        commentState.comment?.let {
            Text(text = "${it[0].name}")
        }
    }
}