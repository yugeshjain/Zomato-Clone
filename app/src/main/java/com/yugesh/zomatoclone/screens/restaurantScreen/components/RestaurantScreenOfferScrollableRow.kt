package com.yugesh.zomatoclone.screens.restaurantScreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun RestaurantScreenOfferScrollableRow() {
    Surface {
        LazyRow(
            modifier = Modifier
                .background(Color.White)
        ) {
            items(1) {
                OfferRowItem("50% OFF up to ₹100", "TRYNEW")
            }
            items(1) {
                OfferRowItem("Get up to ₹100 Paytm", "PAYTMFEAST")
            }
            items(1) {
                OfferRowItem("Flat ₹30 OFF", "HDFCFEAST")
            }
        }
    }
}
