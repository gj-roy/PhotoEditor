package com.burhanrashid52.photoediting.filters

import com.roy.photoeditor.PhotoFilter

interface FilterListener {
    fun onFilterSelected(photoFilter: PhotoFilter)
}