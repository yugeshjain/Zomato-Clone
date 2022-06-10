package com.yugesh.zomatoclone.screens.homeScreen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yugesh.zomatoclone.R

@Composable
fun FoodTypesHomeScreenCircleGrid() {
    Column(
        modifier = Modifier.padding(end = 16.dp, start = 10.dp)
    ) {
        Text(
            text = "Eat What Makes You happy",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(horizontal = 5.dp, vertical = 12.dp)
        )
        LazyHorizontalGrid(
            rows = GridCells.Fixed(count = 2)
        ) {
            items(1) {
                HomePageFoodsGridItem(
                    title = "Thali",
                    iconId = R.drawable.thali,
                    onCLick = {}
                )
            }
            items(1) {
                HomePageFoodsGridItem(
                    title = "Pizza",
                    iconId = R.drawable.pizza,
                    onCLick = {}
                )
            }
            items(1) {
                HomePageFoodsGridItem(
                    title = "Healthy",
                    iconId = R.drawable.salad,
                    onCLick = {}
                )
            }
            items(1) {
                HomePageFoodsGridItem(
                    title = "Rolls",
                    iconId = R.drawable.rolls,
                    onCLick = {}
                )
            }
            items(1) {
                HomePageFoodsGridItem(
                    title = "Burger",
                    iconId = R.drawable.burger,
                    onCLick = {}
                )
            }
            items(1) {
                HomePageFoodsGridItem(
                    title = "Biryani",
                    iconId = R.drawable.biryani_veg,
                    onCLick = {}
                )
            }
            items(1) {
                HomePageFoodsGridItem(
                    title = "Paratha",
                    iconId = R.drawable.paratha,
                    onCLick = {}
                )
            }
            items(1) {
                HomePageFoodsGridItem(
                    title = "Chaat",
                    iconId = R.drawable.chaat,
                    onCLick = {}
                )
            }
        }
    }
}