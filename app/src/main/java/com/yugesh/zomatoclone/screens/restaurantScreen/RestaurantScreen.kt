package com.yugesh.zomatoclone.screens.restaurantScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.yugesh.zomatoclone.screens.homeScreen.components.FoodTypesHomeScreenCircleGrid
import com.yugesh.zomatoclone.screens.restaurantScreen.components.RestaurantScreenBottomBar
import com.yugesh.zomatoclone.screens.restaurantScreen.components.RestaurantScreenCategoryDropDown
import com.yugesh.zomatoclone.screens.restaurantScreen.components.RestaurantScreenFAB
import com.yugesh.zomatoclone.screens.restaurantScreen.components.RestaurantScreenInfoSection
import com.yugesh.zomatoclone.screens.restaurantScreen.components.RestaurantScreenOfferScrollableRow
import com.yugesh.zomatoclone.screens.restaurantScreen.components.RestaurantScreenTopAppBar
import com.yugesh.zomatoclone.screens.restaurantScreen.components.SwitchButtonsRow

@com.ramcosta.composedestinations.annotation.Destination
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun RestaurantScreen(
    offerPercentageText: Int?,
    offerUpToText: Int?,
    restaurantName: String,
    restaurantType: String,
    restaurantLocation: String,
    deliveryDistanceInKms: Int,
    isMultipleLocations: Boolean = false,
    deliveryTimeInMins: Int,
    isPureVegetarian: Boolean = false,
    ratingText: Float?
) {
    Scaffold(
        backgroundColor = Color(0xFFEEEEEE),
        bottomBar = {
            RestaurantScreenBottomBar(
                offerPercentageText = offerPercentageText,
                offerUpToText = offerUpToText
            )
        },
        floatingActionButton = { RestaurantScreenFAB() },
        floatingActionButtonPosition = FabPosition.Center,
        topBar = {
            TopAppBar(
                modifier = Modifier
                    .padding(top = 45.dp),
                elevation = 0.dp,
                backgroundColor = Color.White
            ) {
                RestaurantScreenTopAppBar()
            }
        }
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(state = rememberScrollState())
                .fillMaxSize()
        ) {
            RestaurantScreenInfoSection(
                restaurantName,
                restaurantType,
                restaurantLocation,
                deliveryDistanceInKms,
                isMultipleLocations,
                deliveryTimeInMins,
                ratingText
            )
            RestaurantScreenOfferScrollableRow()
            SwitchButtonsRow(isPureVegetarian)
            RestaurantScreenCategoryDropDown({FoodTypesHomeScreenCircleGrid()}, "Recommended", 35)
            RestaurantScreenCategoryDropDown({FoodTypesHomeScreenCircleGrid()}, "Recommended", 35)
        }
    }
}