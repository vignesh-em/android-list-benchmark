package com.example.listbenchmark.ui.list

import com.example.listbenchmark.ui.fakedata.Plant
import com.example.listbenchmark.adapter.DiffUtilCallback

object PlantDiffUtilCallback : DiffUtilCallback<Plant>() {
    override fun areItemsTheSame(oldItem: Plant, newItem: Plant) = false

    override fun areContentsTheSame(oldItem: Plant, newItem: Plant) = false

}