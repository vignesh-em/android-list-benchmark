package com.example.listbenchmark.ui.list.viewtypeproviders

import com.example.listbenchmark.adapter.BenchmarkViewType
import com.example.listbenchmark.adapter.ItemViewTypeProvider

class ComposeViewTypeProvider : ItemViewTypeProvider() {
    override fun getViewType(position: Int) = BenchmarkViewType.Composable

}
