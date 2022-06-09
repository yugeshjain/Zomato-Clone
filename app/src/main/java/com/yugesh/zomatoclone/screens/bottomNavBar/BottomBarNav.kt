package com.yugesh.zomatoclone.screens.bottomNavBar

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.ramcosta.composedestinations.spec.DirectionDestinationSpec
import com.yugesh.zomatoclone.R
import com.yugesh.zomatoclone.screens.destinations.DiningScreenDestination
import com.yugesh.zomatoclone.screens.destinations.HomeScreenDestination
import com.yugesh.zomatoclone.screens.destinations.ZplScreenDestination

enum class BottomBarNav(
    val direction: DirectionDestinationSpec,
    @DrawableRes val icon: Int,
    @StringRes val label: Int
) {
    Home(HomeScreenDestination, R.drawable.delivery_bottom_nav, R.string.delivery_bottom_nav),
    Dining(DiningScreenDestination, R.drawable.local_dining_bottom_nav, R.string.dining_bottom_nav),
    ZPL(ZplScreenDestination, R.drawable.zpl_bottom_nav, R.string.zpl_bottom_nav)
}
