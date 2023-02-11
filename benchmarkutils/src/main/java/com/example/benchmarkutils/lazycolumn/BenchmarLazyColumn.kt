package com.example.benchmarkutils.lazycolumn

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable

@Composable
fun <T> BenchMarkLazyColumn(list: List<T>, itemContent: @Composable (T) -> Unit) {
    LazyColumn {
        items(Int.MAX_VALUE) {
            itemContent(list[it % list.size])
        }
    }
}