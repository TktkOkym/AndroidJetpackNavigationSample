package com.project.taewon.samplekotlin.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.project.taewon.samplekotlin.constant.Constants.TAB_1_TITLE
import com.project.taewon.samplekotlin.constant.Constants.TAB_2_TITLE
import com.project.taewon.samplekotlin.view.fragment.PagerItemFragment
import com.project.taewon.samplekotlin.view.fragment.RecyclerViewFragment

class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val tabTitles = arrayOf(TAB_1_TITLE, TAB_2_TITLE)

    override fun getPageTitle(position: Int): CharSequence? {
        return tabTitles[position]
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                PagerItemFragment()
            }
            1 -> {
                RecyclerViewFragment()
            }
            else -> {
                PagerItemFragment()
            }
        }
    }

    override fun getCount(): Int {
        return tabTitles.size
    }
}