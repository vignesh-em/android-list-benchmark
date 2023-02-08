package com.example.listbenchmark

import androidx.recyclerview.widget.DiffUtil
import com.example.listbenchmark.fakedata.Plant

object DefaultDiffUtilCallback : DiffUtil.ItemCallback<Plant>() {
    override fun areItemsTheSame(oldItem: Plant, newItem: Plant) = false

    override fun areContentsTheSame(oldItem: Plant, newItem: Plant) = false
}