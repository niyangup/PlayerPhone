package com.niyang.playerphone.util

import android.content.Intent
import android.support.v7.widget.Toolbar
import com.niyang.playerphone.R
import com.niyang.playerphone.ui.activity.SettingActivity

/**
 * 所有界面ToolBar的管理类
 */
interface ToolBarManager {
    val toolbar: Toolbar

    //主界面的ToolBar
    fun initMainToolBar() {
        toolbar.setTitle("手机影音")
        toolbar.inflateMenu(R.menu.main)

        //如果java接口中只有一个未实现的方法,可以省略接口对象 直接用一个{}的
        toolbar.setOnMenuItemClickListener {
            toolbar.context.startActivity(Intent(toolbar.context, SettingActivity::class.java))
            true
        }
    }

    //设置界面的ToolBar
    fun initSettingToolBar(){
        toolbar.setTitle("设置")

    }
}
