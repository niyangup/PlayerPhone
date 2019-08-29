package com.niyang.playerphone.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.preference.Preference
import android.preference.PreferenceFragment
import android.preference.PreferenceScreen
import com.niyang.playerphone.R
import com.niyang.playerphone.ui.activity.AboutActivity

class SettingFragment : PreferenceFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addPreferencesFromResource(R.xml.setting)
    }

    override fun onPreferenceTreeClick(preferenceScreen: PreferenceScreen?, preference: Preference?): Boolean {
        val key = preference?.key
        if ("about".equals(key)) {
//            Log.e("TAG", "点击了关于")
            activity.startActivity(Intent(activity, AboutActivity::class.java))
        }

        return super.onPreferenceTreeClick(preferenceScreen, preference)
    }
}