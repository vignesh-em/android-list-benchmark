package com.example.listbenchmark.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.listbenchmark.fakedata.Plant

abstract class BaseViewHolder<T>(view: View) : RecyclerView.ViewHolder(view) {
    abstract fun bind(model: T)
}
