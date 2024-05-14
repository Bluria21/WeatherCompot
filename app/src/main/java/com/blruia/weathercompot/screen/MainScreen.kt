package com.blruia.weathercompot.screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.blruia.weathercompot.view.EditView
import com.blruia.weathercompot.view.RecyclerView
import com.blruia.weathercompot.viewmodel.MainViewModel

@Composable
fun MainScreen(
    mainViewModel: MainViewModel,
    navController: NavController,
) {
    if (mainViewModel.location?.value?.name.isNullOrEmpty()) {
        Text(text = "НЕ НАЙДЕНО")
    } else {
        RecyclerView(
            items = mainViewModel.responseList,
            navController = navController)
    }
    EditView(mainViewModel.buttonAction)
}