package com.niyang.playerphone.ui.fragment

import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.TextView
import com.niyang.playerphone.base.BaseFragment

class MvFragment : BaseFragment() {
    override fun initView(): View? {
        val textView = TextView(activity)
        textView.gravity = Gravity.CENTER
        textView.setTextColor(Color.RED)
        textView.text = javaClass.simpleName
        return textView
    }
}
