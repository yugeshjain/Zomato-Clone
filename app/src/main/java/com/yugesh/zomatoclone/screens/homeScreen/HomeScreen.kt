package com.yugesh.zomatoclone.screens.homeScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.yugesh.zomatoclone.screens.bottomNavBar.BottomNavBar
import com.yugesh.zomatoclone.screens.homeScreen.components.FilterScrollableRow
import com.yugesh.zomatoclone.screens.homeScreen.components.HomeScreenSearchTextField
import com.yugesh.zomatoclone.screens.homeScreen.components.RestaurantsHomeScreenCircleLogoGrid
import com.yugesh.zomatoclone.screens.homeScreen.components.TopAppBarComposable

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Destination
@Composable
fun HomeScreen(
    navigator: DestinationsNavigator
) {
    val bgColor = Color(0xFFEEEEEE)
    val navController = rememberNavController()
    Scaffold(
        backgroundColor = bgColor,
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            TopAppBar(
                modifier = Modifier
                    .padding(top = 35.dp),
                elevation = 0.dp,
                backgroundColor = Color.White
            ) {
                TopAppBarComposable()
            }
        },
        bottomBar = { BottomNavBar(navController = navController, navigator = navigator) }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            HomeScreenSearchTextField()
            FilterScrollableRow()
            RestaurantsHomeScreenCircleLogoGrid()
        }
    }
}
