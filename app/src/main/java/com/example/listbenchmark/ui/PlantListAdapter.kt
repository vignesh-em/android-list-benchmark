package com.example.listbenchmark.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.listbenchmark.DefaultDiffUtilCallback
import com.example.listbenchmark.fakedata.Plant

class PlantListAdapter(private val adapterType: AdapterType) :
    ListAdapter<Plant, BaseViewHolder<Plant>>(DefaultDiffUtilCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Plant> {
        return ViewHolderCreator.createViewHolder(parent, viewType)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Plant>, position: Int) {
        holder.bind(getItem(position % super.getItemCount()))
    }

    override fun getItemCount(): Int {
        return if (super.getItemCount() > 0) Int.MAX_VALUE else 0
    }

    override fun getItemViewType(position: Int): Int {
        return when (adapterType) {
            AdapterType.View -> ViewHolderCreator.VIEW_TYPE_VIEW
            AdapterType.Compose -> ViewHolderCreator.VIEW_TYPE_COMPOSE_VEW
            AdapterType.ViewPlusCompose -> {
                if (position % 2 == 0) ViewHolderCreator.VIEW_TYPE_VIEW
                else ViewHolderCreator.VIEW_TYPE_COMPOSE_VEW
            }
        }
    }
}

enum class AdapterType {
    View,
    Compose,
    ViewPlusCompose
}