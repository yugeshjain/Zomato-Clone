package com.yugesh.zomatoclone.screens.loginScreen.components.countryCodePicker

import android.content.Context

fun List<CountryData>.searchCountry(key: String, context: Context): MutableList<CountryData> {
    val tempList = mutableListOf<CountryData>()
    this.forEach {
        if (context.resources.getString(getCountryName(it.countryCode)).lowercase()
                .contains(key.lowercase())
        ) {
            tempList.add(it)
        }
    }
    return tempList
}
