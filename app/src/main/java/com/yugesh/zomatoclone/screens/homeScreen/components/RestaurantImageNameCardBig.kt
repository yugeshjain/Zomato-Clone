package com.yugesh.zomatoclone.screens.homeScreen.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.yugesh.zomatoclone.R

@Composable
fun RestaurantImageNameCardBig(
    @DrawableRes image: Int,
    RestaurantName: String,
    RestaurantType: String,
    offerPercentageText: String?,
    offerUptoText: String?,
    ratingText: String?,
    isPureVegetarian: Boolean = false,
    isPromoted: Boolean = false
) {
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = 4.dp,
        backgroundColor = Color.White,
        modifier = Modifier
            .width(LocalConfiguration.current.screenWidthDp.dp)
            .padding(vertical = 6.dp, horizontal = 16.dp)
    ) {
        Box {

        }
    }
}

@Composable
fun ImageBigCard(){
    Box(
        contentAlignment = Alignment.TopCenter
    ){
        Image(painter = painterResource(id = R.drawable.google_logo), contentDescription = "")
//        RO(
//            verticalArrangement = Arrangement.SpaceBetween,
//            horizontalAlignment = Alignment.S
//        ) {
//
//        }
    }
}