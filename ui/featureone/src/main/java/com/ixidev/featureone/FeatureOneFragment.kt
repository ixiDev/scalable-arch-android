package com.ixidev.featureone

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import com.ixidev.domain.UiState
import com.ixidev.domain.models.FeatureOneData
import com.ixidev.featureone.databinding.FragmentFeatureOneBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class FeatureOneFragment : Fragment(R.layout.fragment_feature_one) {


    private val viewModel: FeatureOneViewModel by viewModels()

    private lateinit var binding: FragmentFeatureOneBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentFeatureOneBinding.bind(view)

        lifecycleScope.launch {
            viewModel.dataState.flowWithLifecycle(lifecycle)
                .collectLatest {
                    onUiStateChange(it)
                }
        }
    }

    private fun onUiStateChange(state: UiState<FeatureOneData>) {
        when (state) {
            is UiState.Error -> {
                // TODO: show error
            }

            UiState.Loading -> {
                binding.progressBar.isVisible = true
                binding.tv.isVisible = false
            }

            is UiState.Success -> {
                binding.progressBar.isVisible = false
                binding.tv.isVisible = true
                binding.tv.text = state.data?.text
            }
        }
    }

}