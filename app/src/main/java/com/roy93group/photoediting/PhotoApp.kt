package com.roy93group.photoediting

import android.app.Application

//TODO applovin
//TODO firebase

//done
//ic_launcher
//manifest ad id
//proguard
//leak canary
//share app
//more app
//rate app
//policy
//keystore

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
