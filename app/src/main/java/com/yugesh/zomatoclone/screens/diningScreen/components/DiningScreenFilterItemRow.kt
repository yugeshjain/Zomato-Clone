package com.yugesh.zomatoclone.screens.diningScreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.yugesh.zomatoclone.screens.commonComponents.FilterRowCard

@Composable
fun DiningScreenFilterItemRow() {
    Surface {
        LazyRow(
            modifier = Modifier
                .background(Color.White)
                .padding(horizontal = 10.dp),
        ) {
            items(1) {
                FilterRowCard(
                    text = "Relevance",
                    leadingIcon = Icons.Default.Info,
                    trailingIcon = Icons.Filled.ArrowDropDown
                )
            }
            items(1) {
                FilterRowCard(
                    text = "MAX Safety"
                )
            }
            items(1) {
                FilterRowCard(
                    text = "Nearest"
                )
            }
            items(1) {
                FilterRowCard(
                    text = "Book Table"
                )
            }
            items(1) {
                FilterRowCard(
                    text = "Cuisines",
                    trailingIcon = Icons.Filled.ArrowDropDown
                )
            }
            items(1) {
                FilterRowCard(
                    text = "Outdoor Seating"
                )
            }
            items(1) {
                FilterRowCard(
                    text = "Serves Alcohol"
                )
            }
            items(1) {
                FilterRowCard(
                    text = "Pure Veg"
                )
            }
            items(1) {
                FilterRowCard(
                    text = "Open Now"
                )
            }
            items(1) {
                FilterRowCard(
                    text = "More",
                    trailingIcon = Icons.Filled.ArrowDropDown
                )
            }
        }
    }
}
