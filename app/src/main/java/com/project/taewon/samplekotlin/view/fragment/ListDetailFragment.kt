package com.project.taewon.samplekotlin.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.project.taewon.samplekotlin.constant.Constants
import com.project.taewon.samplekotlin.databinding.FragmentListDetailBinding
import kotlinx.android.synthetic.main.fragment_list_detail.view.*

/**
 * A simple [Fragment] subclass.
 *
 */
class ListDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentListDetailBinding.inflate(inflater, container, false)

        arguments?.let {
            val string: String = arguments!!.getString(Constants.BUNDLE_NAME) ?: ""
            binding.root.list_detail_text.text = "$string LIST DETAIL"
        }
        return binding.root
    }
}
