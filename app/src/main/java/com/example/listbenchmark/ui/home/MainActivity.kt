package com.example.listbenchmark.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.listbenchmark.ui.ComposeActivity
import com.example.listbenchmark.ui.RecyclerViewActivity
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
        val intent = when (item) {
            HomeListItem.ComposeLazyColumn -> Intent(this, ComposeActivity::class.java)
            HomeListItem.ComposeViewInRecyclerView -> null
            HomeListItem.NativeRecyclerView -> Intent(this, RecyclerViewActivity::class.java)
            HomeListItem.XmlViewComposeViewInRecyclerView -> null
        }

        intent?.let { startActivity(it) }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}
