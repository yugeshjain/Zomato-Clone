package com.yugesh.zomatoclone.screens.homeScreen.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Info
import androidx.compose.ui.graphics.vector.ImageVector

enum class HomeScreenFilterItems(
    val text: String,
    val leadingIcon: ImageVector? = null,
    val trailingIcon: ImageVector? = null
) {
    SORT(
        text = "Sort",
        leadingIcon = Icons.Default.Info,
        trailingIcon = Icons.Filled.ArrowDropDown,
    ),
    FAST_DELIVERY(
        text = "Fast Delivery"
    ),
    PURE_VEG(
        text = "Pure Veg"
    ),
    RATING_4_PLUS(
        text = "Rating 4.0+"
    ),
    MAX_SAFETY(
        text = "MAX Safety"
    ),
    CUISINES(
        text = "Cuisines",
        trailingIcon = Icons.Filled.ArrowDropDown
    ),
    NEW_ARRIVALS(
        text = "New Arrivals"
    ),
    MORE(
        text = "More",
        trailingIcon = Icons.Filled.ArrowDropDown
    )
}

fun getAllHomeScreenFilterItems(): List<HomeScreenFilterItems> {
    return listOf(
        HomeScreenFilterItems.SORT,
        HomeScreenFilterItems.FAST_DELIVERY,
        HomeScreenFilterItems.PURE_VEG,
        HomeScreenFilterItems.RATING_4_PLUS,
        HomeScreenFilterItems.MAX_SAFETY,
        HomeScreenFilterItems.CUISINES,
        HomeScreenFilterItems.NEW_ARRIVALS,
        HomeScreenFilterItems.MORE
    )
}
