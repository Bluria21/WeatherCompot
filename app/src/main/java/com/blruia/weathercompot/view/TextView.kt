package com.blruia.weathercompot.view

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TextView(
    text:String?,
    modifier: Modifier
) {
    text?.let {
        Text(text = text)
    }

}