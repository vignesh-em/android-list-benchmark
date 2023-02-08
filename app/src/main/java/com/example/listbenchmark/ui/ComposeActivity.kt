package com.example.listbenchmark.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.listbenchmark.fakedata.fakeData
import com.example.listbenchmark.ui.lazycolumn.ComposeLazyColumnScreen
import com.example.listbenchmark.ui.theme.ListBenchmarkTheme

class ComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListBenchmarkTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeLazyColumnScreen(list = fakeData)
                }
            }
        }
    }
}
