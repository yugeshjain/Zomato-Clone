package com.yugesh.zomatoclone.screens.loginScreen.components.countryCodePicker

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.platform.LocalContext
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Composable
fun SelectCountryWithCountryCode(
    navigator: DestinationsNavigator
) {
    val context = LocalContext.current
    val phoneNumber = rememberSaveable { mutableStateOf("") }
    var defaultLang by rememberSaveable { mutableStateOf(getDefaultLangCode(context)) }
    Column {
        CountryCodePicker(
            pickedCountry = {
                defaultLang = it.countryCode
            },
            defaultCountry = getLibCountries().single { it.countryCode == defaultLang },
            text = phoneNumber.value,
            navigator = navigator,
            onValueChange = { phoneNumber.value = it }
        )
    }
}
