package com.jetbrains.handson.mpp.mobile

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import kotlinx.serialization.json.json

expect fun platformName(): String



fun createApplicationScreenMessage() : String {
    return "Kotlin Rocks on ${platformName()}"
}


val jsonFormatter by lazy { Json( JsonConfiguration.Stable.copy( encodeDefaults = false, strictMode = false)) }

fun serializeSample( item: SampleItem): String {
    return jsonFormatter.stringify( SampleItem.serializer(), item)
}

fun deserializeSample( jsonStr: String): SampleItem? {

    return try {
        jsonFormatter.parse(SampleItem.serializer(), jsonStr)
    } catch (t: Throwable) {
        null
    }
}