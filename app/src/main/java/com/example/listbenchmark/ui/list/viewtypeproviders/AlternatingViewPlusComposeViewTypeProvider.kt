package com.example.listbenchmark.ui.list.viewtypeproviders

import com.example.listbenchmark.ui.list.viewholder.PlantViewHolderFactory
import com.example.listbenchmark.adapter.ItemViewTypeProvider

class AlternatingViewPlusComposeViewTypeProvider : ItemViewTypeProvider {
    override fun getItemViewType(position: Int) =
        if (position % 2 == 0) PlantViewHolderFactory.VIEW_TYPE_VIEW
        else PlantViewHolderFactory.VIEW_TYPE_COMPOSE_VEW
}
