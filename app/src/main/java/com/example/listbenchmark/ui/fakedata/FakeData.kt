package com.example.listbenchmark.ui.fakedata

import androidx.annotation.DrawableRes
import com.example.listbenchmark.R

class Plant(val name: String, @DrawableRes val imageId: Int)

val fakeData = arrayListOf(
    Plant("Rocky Mountain Columbine", R.drawable.aquilegia_coerulea),
    Plant("Beet", R.drawable.beta_vulgaris),
    Plant("Bougainvillea", R.drawable.bougainvillea_glabra),
    Plant("Watermelon", R.drawable.citrullus_lanatus),
    Plant("Cilantro", R.drawable.coriandrum_sativum),
    Plant("Pink & White Lady's Slipper", R.drawable.cypripedium_reginae),
    Plant("Sunflower", R.drawable.helianthus_annuus),
    Plant("Hibiscus", R.drawable.hibiscus_rosa_sinensis),
    Plant("Yulan Magnolia", R.drawable.magnolia_denudata),
    Plant("Apple", R.drawable.malus_pumila),
    Plant("Mango", R.drawable.mangifera_indica),
    Plant("Avocado", R.drawable.persea_americana),
    Plant("Pear", R.drawable.pyrus_communis),
    Plant("Tomato", R.drawable.solanum_lycopersicum),
    Plant("Eggplant", R.drawable.solanum_melongena),
    Plant("Grape", R.drawable.vitis_vinifera),
)