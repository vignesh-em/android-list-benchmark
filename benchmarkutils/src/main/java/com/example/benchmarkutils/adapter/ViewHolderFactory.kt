package com.example.benchmarkutils.adapter

import android.view.ViewGroup

abstract class ViewHolderFactory<T> {
    internal fun createViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<T> {
        return createViewHolder(parent, BenchmarkViewType.values()[viewType])
    }

    abstract fun createViewHolder(parent: ViewGroup, viewType: BenchmarkViewType): BaseViewHolder<T>
}
