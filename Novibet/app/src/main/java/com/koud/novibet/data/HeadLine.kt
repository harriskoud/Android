package com.koud.novibet.data

data class HeadLine(
    val betViews: List<BetView>,
    val caption: String,
    val marketViewKey: String,
    val marketViewType: String,
    val modelType: String
)