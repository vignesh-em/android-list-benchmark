package com.example.listbenchmark.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(homeList: List<HomeListItem>, onClick: (HomeListItem) -> Unit) {
    LazyColumn {
        items(homeList) {
            HomeListItem(it, onClick)
            Divider()
        }
    }
}

@Composable
fun HomeListItem(item: HomeListItem, onClick: (HomeListItem) -> Unit) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .heightIn(56.dp)
            .fillMaxWidth()
            .clickable { onClick.invoke(item) }
    ) {
        Text(
            text = item.title,
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 16.dp)
        )
    }
}
