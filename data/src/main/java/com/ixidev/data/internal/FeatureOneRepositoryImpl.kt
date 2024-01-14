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

package com.ixidev.data.internal

import com.ixidev.data.network.ApiService
import com.ixidev.data.network.mappers.toFeatureOneData
import com.ixidev.domain.models.FeatureOneData
import com.ixidev.domain.repository.FeatureOneRepository

internal class FeatureOneRepositoryImpl(
    private val apiService: ApiService
) : FeatureOneRepository {
    override fun getData(): FeatureOneData {
        return apiService.getData()
            .toFeatureOneData()
    }
}


