package com.blruia.weathercompot.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CardView(
    modifier: Modifier
) {
    Row {
        Column {
            Text(
                text = "dds"
            )
        }
        Column {
            Text(text = "dsdsd")
        }
        Column {
            Text(text = "dsdsdd")
        }
    }
}