package com.niyang.playerphone.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.runOnUiThread
import org.jetbrains.anko.toast

/**
 * 所有Fragment的基类
 */
abstract class BaseFragment : Fragment(), AnkoLogger {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    protected fun init() {

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return initView()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initData()
        initListener()
    }

    protected fun initData() {

    }

    protected fun initListener() {

    }

    abstract fun initView(): View?

    protected fun myToast(msg: String) {
        context?.runOnUiThread {
            toast(msg)
        }
    }

}