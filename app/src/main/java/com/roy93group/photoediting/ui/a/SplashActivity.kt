package com.roy93group.photoediting.ui.a

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import com.roy93group.photoediting.R
import com.roy93group.photoediting.base.BaseActivity
import com.roy93group.photoediting.ext.moreApp
import com.roy93group.photoediting.ext.openBrowserPolicy
import com.roy93group.photoediting.ext.rateApp
import com.roy93group.photoediting.ext.shareApp

@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        makeFullScreen()
        setContentView(R.layout.a_splash)

        findViewById<View>(R.id.ivShare).setOnClickListener {
            shareApp()
        }
        findViewById<View>(R.id.ivRate).setOnClickListener {
            rateApp(packageName)
        }
        findViewById<View>(R.id.ivMore).setOnClickListener {
            moreApp("Roy93Group")
        }
        findViewById<View>(R.id.ivPolicy).setOnClickListener {
            openBrowserPolicy()
        }

        goToMain()
    }

    private fun goToMain() {
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, EditImageActivity::class.java)
            startActivity(intent)
            finishAfterTransition()
        }, 1000)
    }
}
