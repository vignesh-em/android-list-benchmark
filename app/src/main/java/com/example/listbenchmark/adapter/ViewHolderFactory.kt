package com.example.listbenchmark.adapter

import android.view.ViewGroup

interface ViewHolderFactory<T> {
    fun createViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<T>
}
