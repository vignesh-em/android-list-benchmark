package com.example.listbenchmark.ui

import androidx.compose.ui.platform.ComposeView
import com.example.listbenchmark.fakedata.Plant
import com.example.listbenchmark.ui.theme.ListBenchmarkTheme

class PlantComposeViewHolder(private val composeView: ComposeView) :
    BaseViewHolder<Plant>(composeView) {
    override fun bind(model: Plant) {
        composeView.setContent {
            ListBenchmarkTheme {
                PlantItem(plant = model)
            }
        }
    }
}
