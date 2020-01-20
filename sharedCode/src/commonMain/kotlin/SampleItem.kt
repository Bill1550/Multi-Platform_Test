package com.jetbrains.handson.mpp.mobile

import kotlinx.serialization.Serializable


@Serializable
data class SampleItem(
    val name: String,
    val length: Int,
    val width: Long
)