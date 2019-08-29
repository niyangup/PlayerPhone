package com.niyang.playerphone.util

import com.niyang.playerphone.R
import com.niyang.playerphone.base.BaseFragment
import com.niyang.playerphone.ui.fragment.HomeFragment
import com.niyang.playerphone.ui.fragment.MvFragment
import com.niyang.playerphone.ui.fragment.VBangFragment
import com.niyang.playerphone.ui.fragment.YueDanFragment

/**
 * 管理Fragment的工具类
 */
class FragmentUtil private constructor() {
    val homeFragment by lazy { HomeFragment() }
    val mvFragment by lazy { MvFragment() }
    val vbangFragment by lazy { VBangFragment() }
    val yueDanFragment by lazy { YueDanFragment() }

    companion object {
        val fragmentUtil by lazy { FragmentUtil() }
    }

    /**
     * 根据tabId获取对应的Fragment
     */
    fun getFragment(tabId: Int): BaseFragment? {
        when (tabId) {
            R.id.tab_home -> return homeFragment
            R.id.tab_mv -> return mvFragment
            R.id.tab_vbang -> return vbangFragment
            R.id.tab_yuedan -> return yueDanFragment
        }

        return null
    }

}