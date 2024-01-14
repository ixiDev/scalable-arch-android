package com.ixidev.ui.di

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.ixidev.domain.AppNavigator
import com.ixidev.ui.R
import com.ixidev.ui.navigation.AppNavigatorImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext


@Module
@InstallIn(ActivityComponent::class)
object NavigationModule {


    @Provides
    fun provideAppNavigator(@ActivityContext context: Context): AppNavigator {
        return AppNavigatorImpl(
            navHostId = R.id.nav_host,
            activity = context as AppCompatActivity
        )
    }
}