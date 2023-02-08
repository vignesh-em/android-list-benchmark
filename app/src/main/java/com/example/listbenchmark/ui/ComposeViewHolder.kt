package com.example.listbenchmark.ui

import androidx.compose.ui.platform.ComposeView
import com.example.listbenchmark.fakedata.Plant
import com.example.listbenchmark.ui.theme.ListBenchmarkTheme

class ComposeViewHolder(private val composeView: ComposeView) :
    BaseViewHolder(composeView) {
    override fun bind(plant: Plant) {
        composeView.setContent {
            ListBenchmarkTheme {
                PlantItem(plant = plant)
            }
        }
    }
}
