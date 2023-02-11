package com.example.listbenchmark.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.listbenchmark.R
import com.example.listbenchmark.fakedata.Plant

@Composable
fun PlantItem(plant: Plant) {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .wrapContentHeight()
            .fillMaxWidth()
    ) {
        PlantCard(name = plant.name, imageId = plant.imageId)
    }
}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun PlantCard(name: String, imageId: Int) {
    Card(elevation = CardDefaults.cardElevation(2.dp)) {
        Column {
            GlideImage(
                model = imageId,
                contentDescription = name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(95.dp)
                    .fillMaxWidth()
            )
            Text(
                text = name,
                textAlign = TextAlign.Center,
                maxLines = 1,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
                    .align(Alignment.CenterHorizontally)
            )
        }
    }
}

@Preview
@Composable
fun PlantItemPreview() {
    PlantItem(Plant("Rocky Mountain Columbine", R.drawable.aquilegia_coerulea))
}
