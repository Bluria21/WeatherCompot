package com.blruia.weathercompot.view

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun EditView(
    action: (String) -> Unit,
) {
    val textState = remember { mutableStateOf("") }
    val isTextFieldVisible = remember { mutableStateOf(false) }
    Row(
        modifier = Modifier
            .fillMaxSize(),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.End
    ) {
        if (isTextFieldVisible.value) {
            TextField(
                value = textState.value,
                onValueChange = { newText -> textState.value = newText },
                placeholder = { },
                modifier = Modifier
                    .border(width = 4.dp, color = Color.Black, shape = RoundedCornerShape(50.dp))
                    .wrapContentHeight()
                    .weight(1f)
                    .clip(RoundedCornerShape(50.dp))
                    .height(48.dp),
            )
        }
        Button(
            onClick = {
                if (isTextFieldVisible.value) {
                    isTextFieldVisible.value = false
                    textState.value = ""
                } else {
                    isTextFieldVisible.value = true
                }
            },
            modifier = Modifier
                .height(48.dp)
                .width(70.dp)
                .border(width = 4.dp, color = Color.Black, shape = RoundedCornerShape(50.dp)),
        ) {
            Icon(
                Icons.Default.Add, contentDescription = "Add icon",
                modifier = Modifier
                    .padding(vertical = 10.dp)

            )
        }
    }
}
