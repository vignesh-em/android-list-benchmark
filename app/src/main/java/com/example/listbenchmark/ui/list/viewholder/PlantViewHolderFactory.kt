package com.example.listbenchmark.ui.list.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import com.example.listbenchmark.databinding.ItemPlantBinding
import com.example.listbenchmark.ui.fakedata.Plant
import com.example.benchmarkutils.adapter.BaseViewHolder
import com.example.benchmarkutils.adapter.BenchmarkViewType
import com.example.benchmarkutils.adapter.ViewHolderFactory

object PlantViewHolderFactory : ViewHolderFactory<Plant>() {
    override fun createViewHolder(
        parent: ViewGroup,
        viewType: BenchmarkViewType
    ) = when (viewType) {
        BenchmarkViewType.View -> PlantViewHolder(
            ItemPlantBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
        BenchmarkViewType.Composable -> PlantComposeViewHolder(ComposeView(parent.context))
    }
}