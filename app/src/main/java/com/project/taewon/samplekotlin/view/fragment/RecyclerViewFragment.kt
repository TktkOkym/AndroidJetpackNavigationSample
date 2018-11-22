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
        binding.myList.layoutManager = GridLayoutManager(context, 1)
        binding.myList.adapter = adapter
        subscribeUi(adapter)
        return binding.root
    }

    // TODO: will use Room DB
    private fun subscribeUi(adapter: MyListAdapter) {
        val itemList : MutableList<Item> = ArrayList()

        itemList.add(Item("The Beatles", "description", "https://media.pitchfork.com/photos/5929a5eec0084474cd0c0835/1:1/w_320/65b0f679.jpg"))
        itemList.add(Item("Queen","aaaa","https://media.pitchfork.com/photos/5929ae24c0084474cd0c184b/1:1/w_320/d1847937.jpg"))
        itemList.add(Item("The Smiths","aaaa","https://media.pitchfork.com/photos/5929bdb5abf31b7dc7155fe6/1:1/w_320/15f5fe1c.jpg"))
        itemList.add(Item("Joy Division", "description", "https://media.pitchfork.com/photos/5929a1859d034d5c69bf29a4/1:1/w_320/d8401b8a.jpg"))
        itemList.add(Item("Kanye West","aaaa","https://media.pitchfork.com/photos/5929b3995e6ef9596932249e/1:1/w_320/1192269b.jpg"))
        adapter.submitList(itemList)
    }
}
