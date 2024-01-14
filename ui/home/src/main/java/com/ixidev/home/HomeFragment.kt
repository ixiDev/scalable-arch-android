package com.ixidev.home

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.ixidev.domain.AppNavigator
import com.ixidev.home.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private val viewModel: HomeViewModel by viewModels()

    @Inject
    lateinit var navigator: AppNavigator

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val binding = FragmentHomeBinding.bind(view)

        binding.featureOne.setOnClickListener {
            navigator.goToFeatureOne()
        }

        binding.featureTwo.setOnClickListener {
            navigator.goToFeatureTwo("Abdelmajid")
        }

    }
}