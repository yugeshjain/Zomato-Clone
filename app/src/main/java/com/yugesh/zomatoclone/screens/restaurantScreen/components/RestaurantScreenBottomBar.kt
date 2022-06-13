package com.yugesh.zomatoclone.screens.restaurantScreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RestaurantScreenBottomBar(
    offerPercentageText: Int?,
    offerUpToText: Int?
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF6F6FF))
    ) {
        Text(
            text = "Get $offerPercentageText% OFF up to ₹$offerUpToText. Use coupon TASTY on orders above ₹159",
            color = Color(0xFF667CBB),
            fontSize = 10.sp,
            modifier = Modifier
                .padding(10.dp)
        )
    }
}
