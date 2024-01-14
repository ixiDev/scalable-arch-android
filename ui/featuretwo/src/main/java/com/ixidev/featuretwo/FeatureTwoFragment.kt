/*
 * Created by Abdelmajid Id ali on 2024
 * abdelmajid.idali@gmail.com
 *
 */

package com.ixidev.featuretwo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.ixidev.featuretwo.databinding.FragmentFeatureTwoBinding

class FeatureTwoFragment : Fragment(R.layout.fragment_feature_two) {


    private val viewModel: FeatureTwoViewModel by viewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentFeatureTwoBinding.bind(view)

        val name = requireArguments().getString("name")
        binding.tv.text = "Hello '$name' in Feature two"
    }

}