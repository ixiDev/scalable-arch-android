package com.ixidev.featureone

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ixidev.domain.UiState
import com.ixidev.domain.models.FeatureOneData
import com.ixidev.domain.repository.FeatureOneRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FeatureOneViewModel @Inject constructor(
    private val repository: FeatureOneRepository
) : ViewModel() {

    private val _dataState = MutableStateFlow<UiState<FeatureOneData>>(
        UiState.Loading
    )
    val dataState: Flow<UiState<FeatureOneData>>
        get() = _dataState.asStateFlow()


    init {
        getData()
    }

    private fun getData() {
        viewModelScope.launch {
            _dataState.emit(UiState.Loading)
            try {
                delay(500)
                val data = repository.getData()
                _dataState.emit(UiState.Success(data))
            } catch (e: Exception) {
                _dataState.emit(UiState.Error(e))
            }
        }
    }


}