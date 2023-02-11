package com.example.macrobenchmark

import androidx.benchmark.macro.FrameTimingMetric
import androidx.benchmark.macro.StartupMode
import androidx.benchmark.macro.junit4.MacrobenchmarkRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.uiautomator.By
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ScrollPerformanceBenchmark {
    @get:Rule
    val benchmarkRule = MacrobenchmarkRule()

    @Test
    fun scrollLazyColumn() {
        scroll("LazyColumn")
    }

    @Test
    fun scrollLazyVerticalGrid() {
        scroll("LazyVerticalGrid")
    }

    @Test
    fun scrollXmlInRecycler() {
        scroll("XML in Recycler")
    }

    @Test
    fun scrollXmlInRecyclerGrid() {
        scroll("XML in Recycler - Grid")
    }

    @Test
    fun scrollComposableInRecycler() {
        scroll("Composable in Recycler")
    }

    @Test
    fun scrollComposableInRecyclerGrid() {
        scroll("Composable in Recycler - Grid")
    }

    @Test
    fun scrollXmlPlusComposableInRecycler() {
        scroll("XML + Composable in Recycler")
    }

    @Test
    fun scrollXmlPlusComposableInRecyclerGrid() {
        scroll("XML + Composable in Recycler - Grid")
    }

    private fun scroll(title: String) = benchmarkRule.measureRepeated(
        packageName = "com.example.listbenchmark",
        metrics = listOf(FrameTimingMetric()),
        iterations = 5,
        startupMode = StartupMode.COLD,
        setupBlock = {
            pressHome()
            startActivityAndWait()
            device.findObject(By.text(title)).click()
        }
    ) {
        with(device) {
            val startX = (displayWidth * 0.5).toInt()
            val startY = (displayHeight * 0.75).toInt()
            val endY = (displayHeight * 0.25).toInt()
            repeat(5) {
                device.drag(startX, startY, startX, endY, 50)
            }
        }
    }
}