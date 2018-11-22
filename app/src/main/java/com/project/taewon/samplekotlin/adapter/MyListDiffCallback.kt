package com.project.taewon.samplekotlin.adapter

import androidx.recyclerview.widget.DiffUtil
import com.project.taewon.samplekotlin.data.Item

class MyListDiffCallback : DiffUtil.ItemCallback<Item>() {
    override fun areItemsTheSame(
            oldItem: Item,
            newItem: Item
    ): Boolean {
        return oldItem.name == newItem.name // check uniqueness
    }

    override fun areContentsTheSame(
            oldItem: Item,
            newItem: Item
    ): Boolean {
        return oldItem == newItem // check contents
    }
}