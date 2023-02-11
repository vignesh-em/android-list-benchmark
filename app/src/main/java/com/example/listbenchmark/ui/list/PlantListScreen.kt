package com.example.listbenchmark.ui.list

import androidx.compose.runtime.Composable
import com.example.listbenchmark.lazycolumn.BenchMarkLazyColumn
import com.example.listbenchmark.ui.fakedata.Plant

@Composable
fun PlantListScreen(list: List<Plant>) {
    BenchMarkLazyColumn(list = list) {
        PlantItem(it)
    }
}
