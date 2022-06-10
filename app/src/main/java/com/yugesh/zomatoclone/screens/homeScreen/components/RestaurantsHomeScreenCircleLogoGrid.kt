package com.yugesh.zomatoclone.screens.homeScreen.components

import android.widget.GridLayout
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.flowlayout.FlowRow
import com.google.accompanist.flowlayout.MainAxisAlignment
import com.google.accompanist.flowlayout.SizeMode
import com.yugesh.zomatoclone.R

@Composable
fun RestaurantsHomeScreenCircleLogoGrid(
    itemSize: Dp
) {
    Column(
        modifier = Modifier.padding(end = 16.dp, start = 10.dp)
    ) {
        Text(
            text = "Top Brands for you",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 5.dp, bottom = 12.dp)
        )
        FlowRow(
            mainAxisSize = SizeMode.Expand,
            mainAxisAlignment = MainAxisAlignment.SpaceEvenly
        ) {
            HomePageTopBrandGridItem(
                title = "Haldiram's",
                iconId = R.drawable.haldirams_logo,
                onCLick = {},
                timeOfArrival = "35 mins",
                timerIconTint = Color(0xFFBB9045),
                discount = "50% OFF",
                itemSize = itemSize
            )
            HomePageTopBrandGridItem(
                title = "McDonald's",
                iconId = R.drawable.mcdonalds_logo,
                onCLick = {},
                timeOfArrival = "30 mins",
                timerIconTint = Color(0xFFC4AA4C),
                discount = "20% OFF",
                itemSize = itemSize
            )
            HomePageTopBrandGridItem(
                title = "KFC",
                iconId = R.drawable.kfc_logo,
                onCLick = {},
                timeOfArrival = "65 mins",
                timerIconTint = Color(0xFFFF2525),
                itemSize = itemSize
            )
            HomePageTopBrandGridItem(
                title = "Burger King",
                iconId = R.drawable.burger_king_logo,
                onCLick = {},
                timeOfArrival = "20 mins",
                timerIconTint = Color(0xFF8BC34A),
                discount = "40% OFF",
                itemSize = itemSize
            )
            HomePageTopBrandGridItem(
                title = "Pizza Hut",
                iconId = R.drawable.pizza_hut_logo,
                onCLick = {},
                timeOfArrival = "15 mins",
                timerIconTint = Color(0xFF8BC34A),
                discount = "20% OFF",
                itemSize = itemSize
            )
            HomePageTopBrandGridItem(
                title = "Burgito's",
                iconId = R.drawable.burgitos_logo,
                onCLick = {},
                timeOfArrival = "25 mins",
                timerIconTint = Color(0xFF96993F),
                itemSize = itemSize
            )
            HomePageTopBrandGridItem(
                title = "Tim Hortons",
                iconId = R.drawable.tim_hortons_logo,
                onCLick = {},
                timeOfArrival = "45 mins",
                timerIconTint = Color(0xFFFFD75E),
                discount = "0.5% OFF",
                itemSize = itemSize
            )
            HomePageTopBrandGridItem(
                title = "Wendy's",
                iconId = R.drawable.wendys_logo,
                onCLick = {},
                timeOfArrival = "15 mins",
                timerIconTint = Color(0xFF8BC34A),
                discount = "40% OFF",
                itemSize = itemSize
            )
        }
//        Row {
//            HomePageTopBrandGridItem(
//                title = "Pizza Hut",
//                iconId = R.drawable.pizza_hut_logo,
//                onCLick = {},
//                timeOfArrival = "15 mins",
//                timerIconTint = Color(0xFF8BC34A),
//                discount = "20% OFF",
//                itemSize = itemSize
//            )
//            HomePageTopBrandGridItem(
//                title = "Burgito's",
//                iconId = R.drawable.burgitos_logo,
//                onCLick = {},
//                timeOfArrival = "25 mins",
//                timerIconTint = Color(0xFF96993F),
//                itemSize = itemSize
//            )
//            HomePageTopBrandGridItem(
//                title = "Tim Hortons",
//                iconId = R.drawable.tim_hortons_logo,
//                onCLick = {},
//                timeOfArrival = "45 mins",
//                timerIconTint = Color(0xFFFFD75E),
//                discount = "0.5% OFF",
//                itemSize = itemSize
//            )
//            HomePageTopBrandGridItem(
//                title = "Wendy's",
//                iconId = R.drawable.wendys_logo,
//                onCLick = {},
//                timeOfArrival = "15 mins",
//                timerIconTint = Color(0xFF8BC34A),
//                discount = "40% OFF",
//                itemSize = itemSize
//            )
//        }
//        LazyVerticalGrid(
//            columns = GridCells.Fixed(count = 4)
//        ) {
//            items(1) {
//                HomePageTopBrandGridItem(
//                    title = "Haldiram's",
//                    iconId = R.drawable.haldirams_logo,
//                    onCLick = {},
//                    timeOfArrival = "35 mins",
//                    timerIconTint = Color(0xFFBB9045),
//                    discount = "50% OFF"
//                )
//            }
//            items(1) {
//                HomePageTopBrandGridItem(
//                    title = "McDonald's",
//                    iconId = R.drawable.mcdonalds_logo,
//                    onCLick = {},
//                    timeOfArrival = "30 mins",
//                    timerIconTint = Color(0xFFC4AA4C),
//                    discount = "20% OFF"
//                )
//            }
//            items(1) {
//                HomePageTopBrandGridItem(
//                    title = "KFC",
//                    iconId = R.drawable.kfc_logo,
//                    onCLick = {},
//                    timeOfArrival = "65 mins",
//                    timerIconTint = Color(0xFFFF2525)
//                )
//            }
//            items(1) {
//                HomePageTopBrandGridItem(
//                    title = "Burger King",
//                    iconId = R.drawable.burger_king_logo,
//                    onCLick = {},
//                    timeOfArrival = "20 mins",
//                    timerIconTint = Color(0xFF8BC34A),
//                    discount = "40% OFF"
//                )
//            }
//            items(1) {
//                HomePageTopBrandGridItem(
//                    title = "Pizza Hut",
//                    iconId = R.drawable.pizza_hut_logo,
//                    onCLick = {},
//                    timeOfArrival = "15 mins",
//                    timerIconTint = Color(0xFF8BC34A),
//                    discount = "20% OFF"
//                )
//            }
//            items(1) {
//                HomePageTopBrandGridItem(
//                    title = "Burgito's",
//                    iconId = R.drawable.burgitos_logo,
//                    onCLick = {},
//                    timeOfArrival = "25 mins",
//                    timerIconTint = Color(0xFF96993F)
//                )
//            }
//            items(1) {
//                HomePageTopBrandGridItem(
//                    title = "Tim Hortons",
//                    iconId = R.drawable.tim_hortons_logo,
//                    onCLick = {},
//                    timeOfArrival = "45 mins",
//                    timerIconTint = Color(0xFFFFD75E),
//                    discount = "0.5% OFF"
//                )
//            }
//            items(1) {
//                HomePageTopBrandGridItem(
//                    title = "Wendy's",
//                    iconId = R.drawable.wendys_logo,
//                    onCLick = {},
//                    timeOfArrival = "15 mins",
//                    timerIconTint = Color(0xFF8BC34A),
//                    discount = "40% OFF"
//                )
//            }
//        }
    }
}
