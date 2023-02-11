package com.example.listbenchmark.ui.list.viewholder

import androidx.compose.ui.platform.ComposeView
import com.example.listbenchmark.ui.fakedata.Plant
import com.example.benchmarkutils.adapter.BaseViewHolder
import com.example.listbenchmark.ui.list.PlantItem
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
