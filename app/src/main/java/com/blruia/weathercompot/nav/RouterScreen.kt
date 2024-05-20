package com.blruia.weathercompot.nav

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import com.blruia.weathercompot.screen.MainScreen
import com.blruia.weathercompot.screen.SecondScreen
import com.blruia.weathercompot.viewmodel.MainViewModel
import com.blruia.weathercompot.viewmodel.SecondViewModel
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable



@Composable
fun RouterScreen() {
    val secondViewModel = hiltViewModel<SecondViewModel>()
    val mainViewModel = hiltViewModel<MainViewModel>()
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "main_screen") {
        composable("main_screen") {
            MainScreen(mainViewModel = mainViewModel, navController = navController)
        }
        composable("second_screen") {//сюда передаешь айди нажатого
            SecondScreen(secondViewModel = secondViewModel, navController = navController)
        }
    }
}