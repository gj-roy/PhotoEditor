package com.roy.photoeditor

import android.graphics.Bitmap

interface OnSaveBitmap {
    fun onBitmapReady(saveBitmap: Bitmap)
}
