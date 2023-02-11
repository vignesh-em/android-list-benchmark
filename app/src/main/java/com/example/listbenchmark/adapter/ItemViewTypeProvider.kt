package com.example.listbenchmark.adapter

fun interface ItemViewTypeProvider {
    fun getItemViewType(position: Int): Int
}