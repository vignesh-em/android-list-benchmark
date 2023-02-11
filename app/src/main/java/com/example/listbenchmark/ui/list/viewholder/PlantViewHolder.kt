package com.example.listbenchmark.ui.list.viewholder

import com.bumptech.glide.Glide
import com.example.listbenchmark.databinding.ItemPlantBinding
import com.example.listbenchmark.ui.fakedata.Plant
import com.example.benchmarkutils.adapter.BaseViewHolder

class PlantViewHolder(private val binding: ItemPlantBinding) : BaseViewHolder<Plant>(binding.root) {
    override fun bind(model: Plant) {
        with(binding) {
            plantName.text = model.name
            plantImage.contentDescription = model.name
            Glide.with(plantImage).load(model.imageId).into(plantImage)
        }
    }
}
