package com.example.listbenchmark.ui.compose

import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.recyclerview.widget.ListAdapter
import com.example.listbenchmark.DefaultDiffUtilCallback
import com.example.listbenchmark.fakedata.Plant

class ComposeListAdapter : ListAdapter<Plant, ComposeViewHolder>(DefaultDiffUtilCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComposeViewHolder {
        return ComposeViewHolder(ComposeView(parent.context))
    }

    override fun onBindViewHolder(holder: ComposeViewHolder, position: Int) {
        holder.bind(getItem(position % super.getItemCount()))
    }

    override fun getItemCount(): Int {
        return if (super.getItemCount() > 0) Int.MAX_VALUE else 0
    }
}