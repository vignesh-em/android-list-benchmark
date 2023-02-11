package com.example.listbenchmark.ui.list

import androidx.compose.runtime.Composable
import com.example.listbenchmark.lazycolumn.BenchMarkLazyColumn
import com.example.listbenchmark.lazycolumn.BenchMarkLazyVerticalGrid
import com.example.listbenchmark.ui.fakedata.Plant

@Composable
fun PlantListScreen(list: List<Plant>, columns: Int?) {
    if (columns != null) {
        BenchMarkLazyVerticalGrid(list = list, columns = columns) {
            PlantItem(plant = it)
        }
    } else {
        BenchMarkLazyColumn(list = list) {
            PlantItem(plant = it)
        }
    }
}
