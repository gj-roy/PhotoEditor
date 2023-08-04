package com.roy93group.photoediting

import android.app.Application

//TODO applovin
//TODO firebase

//TODO ic_launcher
//TODO manifest ad id
//TODO proguard
//TODO leak canary
//TODO share app
//TODO more app
//TODO rate app
//TODO policy
//TODO keystore

//done

class PhotoApp : Application() {
    override fun onCreate() {
        super.onCreate()
        photoApp = this
    }

    companion object {
        var photoApp: PhotoApp? = null
            private set
        private val TAG = PhotoApp::class.java.simpleName
    }
}
