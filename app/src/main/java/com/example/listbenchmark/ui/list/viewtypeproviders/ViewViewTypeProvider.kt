package com.example.listbenchmark.ui.list.viewtypeproviders

import com.example.listbenchmark.ui.list.viewholder.PlantViewHolderFactory
import com.example.listbenchmark.adapter.ItemViewTypeProvider

class ViewViewTypeProvider : ItemViewTypeProvider {
    override fun getItemViewType(position: Int) = PlantViewHolderFactory.VIEW_TYPE_VIEW
}
