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

package com.ixidev.data.network.mappers

import com.ixidev.data.network.dto.FeatureOneDato
import com.ixidev.domain.models.FeatureOneData

/**
 * Created by Abdelmajid Id ali
 * abdelmajid.idali@gmail.com
 */

internal fun FeatureOneDato.toFeatureOneData(): FeatureOneData {
    return FeatureOneData(text = randomText)
}