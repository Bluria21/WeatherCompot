package com.blruia.weathercompot.view

import Model.ConditionDto
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.blruia.yourweather.data.model.LocationDto

@Composable
fun RecyclerView(
    items: List<LocationDto?>,
    navController: NavController,
    idCallback: ((Int) -> Unit)? = null,
) {
    items?.let {
    LazyColumn {
        items(items){location ->
            Row(
                modifier = Modifier
                    .border(width = 4.dp, color = Color.Black)
                    .padding(vertical = 5.dp)
                    .background(Color.Gray)
                    .fillMaxWidth()
            ) {
                TextView(text = location?.name , modifier = Modifier)
            }
}
    }
}
}