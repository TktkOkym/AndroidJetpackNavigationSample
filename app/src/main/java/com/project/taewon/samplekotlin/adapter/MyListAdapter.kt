package com.project.taewon.samplekotlin.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.project.taewon.samplekotlin.R
import com.project.taewon.samplekotlin.constant.Constants
import com.project.taewon.samplekotlin.data.Item
import com.project.taewon.samplekotlin.databinding.ListItemBinding

class MyListAdapter : ListAdapter<Item, MyListAdapter.ViewHolder>(MyListDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ListItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.apply {
            bind(createOnClickListener(item.name), item)
            itemView.tag = item
        }
    }

    private fun createOnClickListener(name: String): View.OnClickListener {
        return View.OnClickListener {
            val bundle: Bundle = bundleOf(
                    Constants.BUNDLE_NAME to name
            )
            it.findNavController()
                    .navigate(R.id.action_fragment_home_to_fragment_list_detail, bundle)
        }
    }

    class ViewHolder(
        private val binding: ListItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(listener: View.OnClickListener, item: Item) {
            binding.apply {
                clickListener = listener
                data = item
                executePendingBindings()
            }
        }
    }
}