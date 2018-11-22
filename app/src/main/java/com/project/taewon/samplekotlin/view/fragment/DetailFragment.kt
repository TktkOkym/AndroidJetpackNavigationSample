package com.project.taewon.samplekotlin.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.project.taewon.samplekotlin.databinding.FragmentDetailBinding

/**
 * A simple [Fragment] subclass.
 *
 */
class DetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }
}
