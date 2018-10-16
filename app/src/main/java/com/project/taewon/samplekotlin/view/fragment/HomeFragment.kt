package com.project.taewon.samplekotlin.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment

import com.project.taewon.samplekotlin.R
import com.project.taewon.samplekotlin.adapter.PagerAdapter
import com.project.taewon.samplekotlin.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 *
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentHomeBinding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_home, container, false)

        binding.viewPager.adapter = PagerAdapter(childFragmentManager)
        binding.tabLayout.setupWithViewPager(binding.viewPager)

        return binding.root
    }
}
