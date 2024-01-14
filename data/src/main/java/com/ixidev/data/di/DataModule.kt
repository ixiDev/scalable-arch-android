/*
 * Created by Abdelmajid Id ali on 2024
 * abdelmajid.idali@gmail.com
 *
 */

/*
 * Created by Abdelmajid Id ali on 2024
 * abdelmajid.idali@gmail.com
 *
 */

package com.ixidev.data.di

import com.ixidev.data.internal.FeatureOneRepositoryImpl
import com.ixidev.data.network.ApiService
import com.ixidev.domain.repository.FeatureOneRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
internal object DataModule {


    @Provides
    fun provideApiService(): ApiService = ApiService()


    @Provides
    fun provideFeatureOneRepo(apiService: ApiService): FeatureOneRepository {
        return FeatureOneRepositoryImpl(apiService)
    }


}