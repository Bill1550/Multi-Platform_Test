package com.loneoaktech.test.multiplatform

import kotlinx.serialization.Serializable

@Serializable
data class TestItem(
    val name: String,
    val age: Int
)