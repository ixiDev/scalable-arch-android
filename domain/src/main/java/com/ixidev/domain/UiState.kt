/*
 * Created by Abdelmajid Id ali on 2024
 * abdelmajid.idali@gmail.com
 *
 */

package com.ixidev.domain


sealed class UiState<out T : Any> {
    data object Loading : UiState<Nothing>()
    data class Error(val throwable: Throwable?) : UiState<Nothing>()
    data class Success<T : Any>(val data: T?) : UiState<T>()
}