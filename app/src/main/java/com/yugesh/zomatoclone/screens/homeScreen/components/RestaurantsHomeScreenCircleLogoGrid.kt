package com.yugesh.zomatoclone.screens.homeScreen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yugesh.zomatoclone.R

@Composable
fun RestaurantsHomeScreenCircleLogoGrid() {
    Column(
        modifier = Modifier.padding(end = 16.dp, start = 10.dp)
    ) {
        Text(
            text = "Top Brands for you",
            color = Color.Black,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 5.dp, bottom = 12.dp)
        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(count = 4)
        ) {
            items(1) {
                HomePageGridItem(
                    title = "Haldiram's",
                    iconId = R.drawable.haldirams_logo,
                    onCLick = {},
                    timeOfArrival = "35 mins",
                    timerIconTint = Color(0xFFBB9045),
                    discount = "50% OFF"
                )
            }
            items(1) {
                HomePageGridItem(
                    title = "McDonald's",
                    iconId = R.drawable.mcdonalds_logo,
                    onCLick = {},
                    timeOfArrival = "30 mins",
                    timerIconTint = Color(0xFFC4AA4C),
                    discount = "20% OFF"
                )
            }
            items(1) {
                HomePageGridItem(
                    title = "Receive",
                    iconId = R.drawable.kfc_logo,
                    onCLick = {},
                    timeOfArrival = "65 mins",
                    timerIconTint = Color(0xFFFF2525)
                )
            }
            items(1) {
                HomePageGridItem(
                    title = "Burger King",
                    iconId = R.drawable.burger_king_logo,
                    onCLick = {},
                    timeOfArrival = "20 mins",
                    timerIconTint = Color(0xFF8BC34A),
                    discount = "40% OFF"
                )
            }
            items(1) {
                HomePageGridItem(
                    title = "Pizza Hut",
                    iconId = R.drawable.pizza_hut_logo,
                    onCLick = {},
                    timeOfArrival = "15 mins",
                    timerIconTint = Color(0xFF8BC34A),
                    discount = "20% OFF"
                )
            }
            items(1) {
                HomePageGridItem(
                    title = "Burgito's",
                    iconId = R.drawable.burgitos_logo,
                    onCLick = {},
                    timeOfArrival = "25 mins",
                    timerIconTint = Color(0xFF96993F)
                )
            }
            items(1) {
                HomePageGridItem(
                    title = "Tim Hortons",
                    iconId = R.drawable.tim_hortons_logo,
                    onCLick = {},
                    timeOfArrival = "45 mins",
                    timerIconTint = Color(0xFFFFD75E),
                    discount = "0.5% OFF"
                )
            }
            items(1) {
                HomePageGridItem(
                    title = "Wendy's",
                    iconId = R.drawable.wendys_logo,
                    onCLick = {},
                    timeOfArrival = "15 mins",
                    timerIconTint = Color(0xFF8BC34A),
                    discount = "40% OFF"
                )
            }
        }
    }
}
