package com.yugesh.zomatoclone.screens.homeScreen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yugesh.zomatoclone.R

@Composable
fun MultipleHomeScreenRestroCards(noOfRestaurantsAround: Int) {
    Column {
        Text(
            text = "$noOfRestaurantsAround restaurants around you",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 16.dp, top = 10.dp, bottom = 16.dp)
        )
        RestaurantImageNameCardBig(
            image = R.drawable.food,
            offerPercentageText = 50,
            offerUpToText = 120,
            deliveryTimeInMins = 15,
            deliveryDistanceInKms = 6,
            ratingText = 3.9f,
            restaurantName = "Jain Bhojnalaya",
            restaurantType = "North Indian, Rajasthani",
            closingSoonTimeInMins = 50,
            costForTwoInINR = 250,
            isPureVegetarian = true,
            isPromoted = true,
            isClosesSoon = true,
            isRecycleFriendly = true
        )
        RestaurantImageNameCardBig(
            image = R.drawable.food,
            offerPercentageText = 20,
            offerUpToText = 200,
            deliveryTimeInMins = 25,
            deliveryDistanceInKms = 4,
            ratingText = 3.9f,
            restaurantName = "Nathu Sweets",
            restaurantType = "North Indian, Rajasthani",
            closingSoonTimeInMins = 50,
            costForTwoInINR = 250,
            isPureVegetarian = true,
            isPromoted = true,
            isClosesSoon = true,
            isRecycleFriendly = true
        )
        RestaurantImageNameCardBig(
            image = R.drawable.food,
            offerPercentageText = 20,
            offerUpToText = 200,
            deliveryTimeInMins = 15,
            deliveryDistanceInKms = 6,
            ratingText = 3.9f,
            restaurantName = "Jain Bhojnalaya",
            restaurantType = "North Indian, Rajasthani",
            closingSoonTimeInMins = 50,
            costForTwoInINR = 250,
            isPureVegetarian = true,
            isPromoted = true,
            isClosesSoon = true,
            isRecycleFriendly = true
        )
        RestaurantImageNameCardBig(
            image = R.drawable.food,
            offerPercentageText = 20,
            offerUpToText = 200,
            deliveryTimeInMins = 15,
            deliveryDistanceInKms = 6,
            ratingText = 3.9f,
            restaurantName = "Jain Bhojnalaya",
            restaurantType = "North Indian, Rajasthani",
            closingSoonTimeInMins = 50,
            costForTwoInINR = 250,
            isPureVegetarian = true,
            isPromoted = true,
            isClosesSoon = true,
            isRecycleFriendly = true
        )
    }
}