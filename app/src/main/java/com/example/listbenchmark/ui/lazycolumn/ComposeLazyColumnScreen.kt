package com.example.listbenchmark.ui.lazycolumn

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.example.listbenchmark.fakedata.Plant
import com.example.listbenchmark.ui.PlantItem

@Composable
fun ComposeLazyColumnScreen(list: List<Plant>) {
    LazyColumn() {
        val listSize = list.size
        items(Int.MAX_VALUE) {
            PlantItem(list[it % listSize])
        }
    }
}
