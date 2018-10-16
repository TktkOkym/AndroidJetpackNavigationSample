package com.project.taewon.samplekotlin.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

import com.project.taewon.samplekotlin.R
import com.project.taewon.samplekotlin.databinding.FragmentPagerItemBinding

/**
 * A simple [Fragment] subclass.
 *
 */
class PagerItemFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding: FragmentPagerItemBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_pager_item, container, false)

        binding.tapText.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_fragment_home_to_fragment_detail)
        }

        return binding.root
    }
}
