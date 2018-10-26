package com.project.taewon.samplekotlin.util

import android.content.Context
import com.project.taewon.samplekotlin.constant.Constants


object Utility {
    fun calculateNoOfColumns(context: Context): Int {
        val displayMetrics = context.resources.displayMetrics
        val dpWidth = displayMetrics.widthPixels / displayMetrics.density
        return (dpWidth / Constants.COLUMN_WIDTH).toInt()
    }
}