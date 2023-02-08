package com.example.listbenchmark

import android.app.Application
import com.google.android.material.color.DynamicColors

class ListBenchmarkApplication : Application() {
    override fun onCreate() {
        DynamicColors.applyToActivitiesIfAvailable(this)
        super.onCreate()
    }
}
