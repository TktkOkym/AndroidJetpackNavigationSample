package com.project.taewon.samplekotlin.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment

import com.project.taewon.samplekotlin.R
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
        val binding: FragmentListDetailBinding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_list_detail, container, false)

        arguments?.let {
            val string: String = arguments!!.getString("row_num") ?: ""
            binding.root.list_detail_text.text = "$string LIST DETAIL"
        }
        return binding.root
    }
}
