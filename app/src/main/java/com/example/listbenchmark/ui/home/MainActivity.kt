package com.example.listbenchmark.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.listbenchmark.ui.GRID_SPAN_COUNT
import com.example.listbenchmark.ui.LIST_TYPE
import com.example.listbenchmark.ui.LIST_TYPE_COMPOSE
import com.example.listbenchmark.ui.LIST_TYPE_VIEW
import com.example.listbenchmark.ui.LIST_TYPE_VIEW_PLUS_COMPOSE
import com.example.listbenchmark.ui.list.ComposeActivity
import com.example.listbenchmark.ui.list.RecyclerViewActivity
import com.example.listbenchmark.ui.theme.ListBenchmarkTheme

class MainActivity : ComponentActivity() {

    private val homeListItem = listOf(
        HomeListItem.ComposeLazyColumn,
        HomeListItem.ComposeLazyVerticalGrid,
        HomeListItem.NativeRecyclerView,
        HomeListItem.NativeRecyclerViewGrid,
        HomeListItem.ComposeViewInRecyclerView,
        HomeListItem.ComposeViewInRecyclerViewGrid,
        HomeListItem.XmlViewComposeViewInRecyclerView,
        HomeListItem.XmlViewComposeViewInRecyclerViewGrid
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListBenchmarkTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen(homeListItem, ::onClick)
                }
            }
        }
    }

    private fun onClick(item: HomeListItem) {
        val intent = when (item) {
            HomeListItem.ComposeLazyColumn -> Intent(this, ComposeActivity::class.java)
            HomeListItem.ComposeLazyVerticalGrid -> {
                Intent(this, ComposeActivity::class.java).apply {
                    putExtra(GRID_SPAN_COUNT, 2)
                }
            }
            HomeListItem.ComposeViewInRecyclerView -> {
                Intent(this, RecyclerViewActivity::class.java).apply {
                    putExtra(LIST_TYPE, LIST_TYPE_COMPOSE)
                }
            }
            HomeListItem.ComposeViewInRecyclerViewGrid -> {
                Intent(this, RecyclerViewActivity::class.java).apply {
                    putExtra(LIST_TYPE, LIST_TYPE_COMPOSE)
                    putExtra(GRID_SPAN_COUNT, 2)
                }
            }
            HomeListItem.NativeRecyclerView -> {
                Intent(this, RecyclerViewActivity::class.java).apply {
                    putExtra(LIST_TYPE, LIST_TYPE_VIEW)
                }
            }
            HomeListItem.XmlViewComposeViewInRecyclerView -> {
                Intent(this, RecyclerViewActivity::class.java).apply {
                    putExtra(LIST_TYPE, LIST_TYPE_VIEW_PLUS_COMPOSE)
                }
            }
            HomeListItem.XmlViewComposeViewInRecyclerViewGrid -> {
                Intent(this, RecyclerViewActivity::class.java).apply {
                    putExtra(LIST_TYPE, LIST_TYPE_VIEW_PLUS_COMPOSE)
                    putExtra(GRID_SPAN_COUNT, 2)
                }
            }
            HomeListItem.NativeRecyclerViewGrid -> {
                Intent(this, RecyclerViewActivity::class.java).apply {
                    putExtra(LIST_TYPE, LIST_TYPE_VIEW)
                    putExtra(GRID_SPAN_COUNT, 2)
                }
            }
            else -> {
                null
            }
        }

        intent?.let { startActivity(it) }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}
