package com.niyang.playerphone.ui.activity

import android.support.v4.view.ViewCompat
import android.support.v4.view.ViewPropertyAnimatorListener
import android.view.View
import com.niyang.playerphone.R
import com.niyang.playerphone.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.*
import org.jetbrains.anko.startActivity

class SplashActivity : BaseActivity(), ViewPropertyAnimatorListener {
    override fun onAnimationCancel(p0: View?) {
    }

    override fun onAnimationStart(p0: View?) {
    }

    override fun onAnimationEnd(p0: View?) {
        //进入主界面
//        startActivity<MainActivity>()
////        finish()
        startActivityAndFinish < MainActivity> ()
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    override fun initData() {
        ViewCompat.animate(imageview).scaleX(1.0f).scaleY(1.0f).setListener(this).setDuration(2000)

    }

}
