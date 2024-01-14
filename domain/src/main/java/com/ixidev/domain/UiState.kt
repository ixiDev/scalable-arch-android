package com.ixidev.domain


sealed class UiState<out T:Any> {
    data object Loading : UiState<Nothing>()
    data class Error(val throwable: Throwable?) : UiState<Nothing>()
    data class Success<T : Any>(val data: T?) : UiState<T>()
}