package com.example.listbenchmark.ui.compose

import androidx.compose.ui.platform.ComposeView
import androidx.recyclerview.widget.RecyclerView
import com.example.listbenchmark.fakedata.Plant
import com.example.listbenchmark.ui.PlantItem
import com.example.listbenchmark.ui.theme.ListBenchmarkTheme

class ComposeViewHolder(private val composeView: ComposeView) :
    RecyclerView.ViewHolder(composeView) {
    fun bind(plant: Plant) {
        composeView.setContent {
            ListBenchmarkTheme {
                PlantItem(plant = plant)
            }
        }
    }
}
