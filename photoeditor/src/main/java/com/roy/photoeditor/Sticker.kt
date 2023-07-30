package com.roy.photoeditor

import android.graphics.Bitmap
import android.view.View
import android.widget.ImageView

internal class Sticker(
    private val mPhotoEditorView: PhotoEditorView,
    private val mMultiTouchListener: MultiTouchListener,
    private val mViewState: PhotoEditorViewState,
    graphicManager: GraphicManager?
) : Graphic(
    context = mPhotoEditorView.context,
    graphicManager = graphicManager,
    viewType = ViewType.IMAGE,
    layoutId = R.layout.v_view_photo_editor_image
) {
    private var imageView: ImageView? = null
    fun buildView(desiredImage: Bitmap?) {
        imageView?.setImageBitmap(desiredImage)
    }

    private fun setupGesture() {
        val onGestureControl = buildGestureController(mPhotoEditorView, mViewState)
        mMultiTouchListener.setOnGestureControl(onGestureControl)
        val rootView = rootView
        rootView.setOnTouchListener(mMultiTouchListener)
    }

    override fun setupView(rootView: View) {
        imageView = rootView.findViewById(R.id.imgPhotoEditorImage)
    }

    init {
        setupGesture()
    }
}
