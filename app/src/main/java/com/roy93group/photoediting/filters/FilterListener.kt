package com.roy93group.photoediting.filters

import com.roy.photoeditor.PhotoFilter

interface FilterListener {
    fun onFilterSelected(photoFilter: PhotoFilter)
}