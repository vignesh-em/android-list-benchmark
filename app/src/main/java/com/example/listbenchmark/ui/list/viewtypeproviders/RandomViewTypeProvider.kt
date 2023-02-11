package com.example.listbenchmark.ui.list.viewtypeproviders

import com.example.listbenchmark.adapter.BenchmarkViewType
import com.example.listbenchmark.adapter.ItemViewTypeProvider

class RandomViewTypeProvider : ItemViewTypeProvider() {

    private val positionToTypeMap = hashMapOf<Int, BenchmarkViewType>()

    override fun getViewType(position: Int): BenchmarkViewType {
        positionToTypeMap[position]?.let {
            return it
        }

        return BenchmarkViewType.values()[(0 until BenchmarkViewType.values().size).random()].also {
            positionToTypeMap[position] = it
        }
    }
}