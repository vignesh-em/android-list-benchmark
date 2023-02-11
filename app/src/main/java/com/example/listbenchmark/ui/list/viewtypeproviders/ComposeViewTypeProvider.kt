package com.example.listbenchmark.ui.list.viewtypeproviders

import com.example.benchmarkutils.adapter.BenchmarkViewType
import com.example.benchmarkutils.adapter.ItemViewTypeProvider

class ComposeViewTypeProvider : ItemViewTypeProvider() {
    override fun getViewType(position: Int) = BenchmarkViewType.Composable

}
