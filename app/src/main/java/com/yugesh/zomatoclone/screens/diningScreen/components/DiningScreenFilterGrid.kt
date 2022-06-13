package com.yugesh.zomatoclone.screens.diningScreen.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yugesh.zomatoclone.R
import com.yugesh.zomatoclone.screens.commonComponents.LHG

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DiningScreenFilterGrid(
    text: String? = null
) {
    Column(
        modifier = Modifier.padding(end = 16.dp, start = 10.dp)
    ) {
        if (text != null) {
            Text(
                text = text,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.padding(horizontal = 5.dp, vertical = 12.dp)
            )
        }
        LHG(
            cells = GridCells.Fixed(count = 2),
            count = 2,
            state = LazyListState()
        ) {
            items(1) {
                DiningScreenGridCard(
                    title = "Outdoor",
                    iconId = R.drawable.outdoor_png,
                    onCLick = {}
                )
            }
            items(1) {
                DiningScreenGridCard(
                    title = "Premium",
                    iconId = R.drawable.premium_png,
                    onCLick = {}
                )
            }
            items(1) {
                DiningScreenGridCard(
                    title = "Events",
                    iconId = R.drawable.events_png,
                    onCLick = {}
                )
            }
            items(1) {
                DiningScreenGridCard(
                    title = "Cafe",
                    iconId = R.drawable.cafe_png,
                    onCLick = {}
                )
            }
            items(1) {
                DiningScreenGridCard(
                    title = "Romantic",
                    iconId = R.drawable.romantic_png,
                    onCLick = {}
                )
            }
            items(1) {
                DiningScreenGridCard(
                    title = "Pubs & Bars",
                    iconId = R.drawable.pubs_and_bars_png,
                    onCLick = {}
                )
            }
            items(1) {
                DiningScreenGridCard(
                    title = "Family Dining",
                    iconId = R.drawable.family_dining_png,
                    onCLick = {}
                )
            }
            items(1) {
                DiningScreenGridCard(
                    title = "Buffet",
                    iconId = R.drawable.buffet_png,
                    onCLick = {}
                )
            }
        }
    }
}