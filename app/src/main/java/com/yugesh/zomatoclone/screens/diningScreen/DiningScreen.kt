package com.yugesh.zomatoclone.screens.diningScreen

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.yugesh.zomatoclone.screens.bottomNavBar.BottomNavBar

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Destination
@Composable
fun DiningScreen(
    navigator: DestinationsNavigator
) {
    val navController = rememberNavController()
    Scaffold(
        backgroundColor = Color.White,
        bottomBar = { BottomNavBar(navigator = navigator, navController = navController) }
    ) {
        Text(text = "DINING SCREEN", color = Color.Black)
    }
}