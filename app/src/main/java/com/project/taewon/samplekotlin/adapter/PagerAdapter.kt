package com.project.taewon.samplekotlin.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.project.taewon.samplekotlin.view.fragment.PagerItemFragment
import com.project.taewon.samplekotlin.view.fragment.RecyclerViewFragment

class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    // tab titles
    private val tabTitles = arrayOf("Tab1", "RecyclerView")

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