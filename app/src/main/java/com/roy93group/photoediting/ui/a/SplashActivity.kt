package com.roy93group.photoediting.ui.a

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.roy93group.photoediting.R
import com.roy93group.photoediting.base.BaseActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        makeFullScreen()
        setContentView(R.layout.a_splash)

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
