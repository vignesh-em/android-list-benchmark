package com.example.listbenchmark.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter

class BenchmarkListAdapter<T>(
    private val viewHolderFactory: ViewHolderFactory<T>,
    private val viewTypeProvider: ItemViewTypeProvider,
    diffUtilCallback: DiffUtilCallback<T>
) : ListAdapter<T, BaseViewHolder<T>>(diffUtilCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        viewHolderFactory.createViewHolder(parent, viewType)

    override fun onBindViewHolder(holder: BaseViewHolder<T>, position: Int) =
        holder.bind(getItem(position % super.getItemCount()))

    override fun getItemCount() = if (super.getItemCount() > 0) Int.MAX_VALUE else 0

    override fun getItemViewType(position: Int) = viewTypeProvider.getItemViewType(position)
}
