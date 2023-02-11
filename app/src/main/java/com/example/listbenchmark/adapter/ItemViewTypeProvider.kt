package com.example.listbenchmark.adapter

abstract class ItemViewTypeProvider {

    internal fun getItemViewType(position: Int) = getViewType(position).type

    abstract fun getViewType(position: Int): BenchmarkViewType
}
