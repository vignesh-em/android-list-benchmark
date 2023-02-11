package com.example.listbenchmark.ui.list.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import com.example.listbenchmark.databinding.ItemPlantBinding
import com.example.listbenchmark.ui.fakedata.Plant
import com.example.listbenchmark.adapter.BaseViewHolder
import com.example.listbenchmark.adapter.ViewHolderFactory

object PlantViewHolderFactory : ViewHolderFactory<Plant> {
    override fun createViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Plant> {
        return when (viewType) {
            VIEW_TYPE_VIEW -> PlantViewHolder(
                ItemPlantBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
            else -> PlantComposeViewHolder(ComposeView(parent.context))
        }
    }

    const val VIEW_TYPE_COMPOSE_VEW = 0
    const val VIEW_TYPE_VIEW = 1
}