package com.example.listbenchmark.fakedata

import androidx.annotation.DrawableRes
import com.example.listbenchmark.R

class Plant(val name: String, @DrawableRes val imageId: Int)

val fakeData = arrayListOf(
    Plant("Aquilegia Coerulea", R.drawable.aquilegia_coerulea),
    Plant("Beta Vulgaris", R.drawable.beta_vulgaris)
)