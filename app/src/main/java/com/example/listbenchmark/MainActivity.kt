package com.example.listbenchmark

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.listbenchmark.ui.home.HomeListItem
import com.example.listbenchmark.ui.home.HomeScreen
import com.example.listbenchmark.ui.theme.ListBenchmarkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListBenchmarkTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val homeListItem = listOf(
                        HomeListItem.ComposeLazyColumn,
                        HomeListItem.NativeRecyclerView,
                        HomeListItem.ComposeViewInRecyclerView,
                        HomeListItem.XmlViewComposeViewInRecyclerView
                    )
                    HomeScreen(homeListItem, ::onClick)
                }
            }
        }
    }

    private fun onClick(item: HomeListItem) {
        Log.d(TAG, "onClick: ${item.title}")
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}
