package com.niyang.playerphone.ui.activity

import android.support.v7.widget.Toolbar
import com.niyang.playerphone.R
import com.niyang.playerphone.base.BaseActivity
import com.niyang.playerphone.util.ToolBarManager
import org.jetbrains.anko.find

class SettingActivity : BaseActivity(), ToolBarManager {
    override val toolbar: Toolbar by lazy { find<Toolbar>(R.id.toolbar) }

    override fun getLayoutId(): Int {
        return R.layout.activity_setting
    }

    override fun initData() {
        initSettingToolBar()
    }

}
