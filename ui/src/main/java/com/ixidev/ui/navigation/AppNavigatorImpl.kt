package com.ixidev.ui.navigation

import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.ixidev.domain.AppNavigator
import com.ixidev.ui.R

internal class AppNavigatorImpl(
    private val navHostId: Int,
    activity: AppCompatActivity
) : AppNavigator {

    private val navController: NavController by lazy {
        activity.findNavController(navHostId)
    }

    override fun goToHome() {
        navController.navigate(R.id.homeFragment)
    }

    override fun goToFeatureOne() {
        navController.navigate(R.id.featureOneFragment)
    }

    override fun goToFeatureTwo(name: String) {
        navController.navigate(
            R.id.featureTwoFragment,
            bundleOf(
                "name" to name
            )
        )
    }
}