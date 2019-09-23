package com.koud.novibet.data


data class BetView(
    val betContextId: Int,
    val betViewKey: String,
    val competitor1Caption: String,
    val competitor2Caption: String,
    val displayFormat: String,
    val imageId: Int,
    val liveData: Any,
    val marketViewGroupId: Int,
    val marketViewId: Int,
    val modelType: String,
    val path: String,
    val rootMarketViewGroupId: Int,
    val startTime: String,
    val text: String,
    val url: Any
)