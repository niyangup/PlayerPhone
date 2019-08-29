package com.niyang.playerphone.base

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.niyang.playerphone.ui.activity.MainActivity
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

/**
 * 所有Acitivity的基类
 */
abstract class BaseActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())

        initListener()
        initData()

    }

    protected fun myToast(msg: String) {
        runOnUiThread {
            toast(msg)
        }
    }

    open protected fun initData() {

    }

    //adapter listener
    open protected fun initListener() {

    }


    abstract fun getLayoutId(): Int

    /**
     * 开启新界面并且结束当前界面
     */
    inline fun <reified T : BaseActivity> startActivityAndFinish() {
        startActivity<T>()
        finish()
    }
}