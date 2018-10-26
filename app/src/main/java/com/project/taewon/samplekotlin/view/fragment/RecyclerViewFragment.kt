package com.project.taewon.samplekotlin.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager

import com.project.taewon.samplekotlin.adapter.MyListAdapter
import com.project.taewon.samplekotlin.data.Item
import com.project.taewon.samplekotlin.databinding.FragmentRecyclerViewBinding
import com.project.taewon.samplekotlin.util.Utility

/**
 * A simple [Fragment] subclass.
 *
 */
class RecyclerViewFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentRecyclerViewBinding.inflate(inflater, container, false)
        val adapter = MyListAdapter()

        val numberOfColumns = Utility.calculateNoOfColumns(context!!)
        binding.myList.layoutManager = GridLayoutManager(context, numberOfColumns)
        binding.myList.adapter = adapter
        subscribeUi(adapter)
        return binding.root
    }

    private fun subscribeUi(adapter: MyListAdapter) {
        val itemList : MutableList<Item> = ArrayList()

        itemList.add(Item("hello", "description", ""))
        itemList.add(Item("aa","aaaa",""))
        itemList.add(Item("bb","aaaa",""))
        itemList.add(Item("hello", "description", ""))
        itemList.add(Item("aa","aaaa",""))
        itemList.add(Item("bb","aaaa",""))
        adapter.submitList(itemList)
    }
}
