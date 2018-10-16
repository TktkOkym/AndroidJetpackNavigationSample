package com.project.taewon.samplekotlin.view.fragment

import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.github.kittinunf.statik.adapter.StatikAdapter
import com.github.kittinunf.statik.dsl.textRow
import com.github.kittinunf.statik.dsl.section
import com.github.kittinunf.statik.dsl.statik
import com.github.kittinunf.statik.representable.ItemRepresentable

import com.project.taewon.samplekotlin.R
import com.project.taewon.samplekotlin.databinding.FragmentRecyclerViewBinding
import kotlinx.android.synthetic.main.fragment_recycler_view.view.*

/**
 * A simple [Fragment] subclass.
 *
 */
class RecyclerViewFragment : Fragment() {
    private lateinit var statikAdapter: StatikAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentRecyclerViewBinding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_recycler_view, container, false)
        binding.root.list.adapter = getStatikAdapterWithData()
        return binding.root
    }

    private fun getStatikAdapterWithData(): StatikAdapter {
        val rowList: MutableList<ItemRepresentable> = mutableListOf()

        for (i in 0..20) {
            rowList.add(
                    textRow {
                        text = i.toString() + "Row"
                        onClickListener = { view ->
                            val bundle: Bundle = bundleOf(
                                    "row_num" to i.toString()
                            )
//                            Navigation.findNavController(view).navigate(
//                                    R.id.fragment_list_detail,
//                                    bundle
//                            )

                            view.findNavController()
                                    .navigate(R.id.action_fragment_home_to_fragment_list_detail, bundle)
                        }
                    })
        }

        val s1 = section {
            rows(rowList)
        }

        statikAdapter = statik {
            sections(s1)
        }

        return statikAdapter
    }
}
