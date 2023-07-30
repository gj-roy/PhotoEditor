package com.roy.photoeditor

import androidx.annotation.Keep

@Keep
data class TextShadow(
    var radius: Float,
    var dx: Float,
    var dy: Float,
    var color: Int
)
