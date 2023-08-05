package com.roy93group.photoediting

import android.app.Application

//TODO applovin
//TODO firebase

//TODO share app
//TODO more app
//TODO rate app
//TODO policy
//TODO keystore

//done
//ic_launcher
//manifest ad id
//proguard
//leak canary

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
