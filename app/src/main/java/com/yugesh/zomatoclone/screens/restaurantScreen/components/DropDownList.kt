package com.yugesh.zomatoclone.screens.restaurantScreen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

@Composable
fun DropDownList() {
    Column {
        DishCardItem(false, true, true, true, true, true, true, true)
        DishCardItem(true, false, true, true, true, true, true, false)
        DishCardItem(true, true, false, true, true, true, false, true)
        DishCardItem(true, true, true, false, true, true, false, false)
        DishCardItem(true, true, true, true, false, true, true, true)
        DishCardItem(true, true, true, true, true, false, true, false)
        DishCardItem(true, false, false, false, false, false, false, true)
        DishCardItem(false, true, false, false, false, false, false, false)
        DishCardItem(false, false, true, false, false, false, true, true)
        DishCardItem(false, false, false, true, false, false, true, false)
        DishCardItem(false, false, false, false, true, false, false, true)
        DishCardItem(false, false, false, false, false, true, false, false)
    }
}