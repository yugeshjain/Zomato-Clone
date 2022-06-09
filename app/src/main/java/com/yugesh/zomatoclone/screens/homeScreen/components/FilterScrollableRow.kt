package com.yugesh.zomatoclone.screens.homeScreen.components

import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FilterScrollableRow() {

    Surface {
        ScrollableTabRow(selectedTabIndex = 0, backgroundColor = Color.White, edgePadding = 10.dp) {
            HomeScreenFilterCard(
                text = "Sort",
                leadingIcon = Icons.Default.Info,
                trailingIcon = Icons.Filled.ArrowDropDown,
                isSelectedBoolean = true,
                onCLick = { })
            HomeScreenFilterCard(text = "Fast Delivery", onCLick = { }, isSelectedBoolean = true)
            HomeScreenFilterCard(text = "Pure Veg", onCLick = { })
            HomeScreenFilterCard(text = "Rating 4.0+", onCLick = { })
            HomeScreenFilterCard(text = "MAX Safety", onCLick = { })
            HomeScreenFilterCard(text = "Offers", onCLick = { })
            HomeScreenFilterCard(
                text = "Cuisines",
                trailingIcon = Icons.Filled.ArrowDropDown,
                onCLick = { })
            HomeScreenFilterCard(text = "New Arrivals", onCLick = { })
            HomeScreenFilterCard(
                text = "More",
                trailingIcon = Icons.Filled.ArrowDropDown,
                onCLick = { })
        }
    }
}
