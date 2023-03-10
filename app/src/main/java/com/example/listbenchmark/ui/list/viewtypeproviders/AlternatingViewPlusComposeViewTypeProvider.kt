package com.example.listbenchmark.ui.list.viewtypeproviders

import com.example.benchmarkutils.adapter.BenchmarkViewType
import com.example.benchmarkutils.adapter.ItemViewTypeProvider

class AlternatingViewPlusComposeViewTypeProvider : ItemViewTypeProvider() {
    override fun getViewType(position: Int): BenchmarkViewType {
        return if (position % 2 == 0) BenchmarkViewType.View else BenchmarkViewType.Composable
    }
}
