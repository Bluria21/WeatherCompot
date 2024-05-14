package com.blruia.weathercompot.view

import androidx.compose.runtime.Composable
import coil.compose.AsyncImage
import Model.ConditionDto
import androidx.compose.foundation.clickable
import androidx.compose.ui.Modifier

@Composable
fun IconView(
    model: ConditionDto
) {
    AsyncImage(
        model = model.icon ,
        contentDescription = null,
        modifier = Modifier
            .clickable {
                //clickAction?.invoke()
        })

}