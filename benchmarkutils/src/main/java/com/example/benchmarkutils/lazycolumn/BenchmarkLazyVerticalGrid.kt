package com.example.benchmarkutils.lazycolumn

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable

@Composable
fun <T> BenchMarkLazyVerticalGrid(
    list: List<T>,
    columns: Int,
    itemContent: @Composable (T) -> Unit
) {
    LazyVerticalGrid(columns = GridCells.Fixed(columns)) {
        items(Int.MAX_VALUE) {
            itemContent(list[it % list.size])
        }
    }
}