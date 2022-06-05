package com.yugesh.zomatoclone.screens.loginScreen.components.countryCodePicker

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.LocalContext

@Composable
fun SelectCountryWithCountryCode() {
    val context = LocalContext.current
    val phoneNumber = rememberSaveable { mutableStateOf("") }
    var defaultLang by rememberSaveable { mutableStateOf(getDefaultLangCode(context)) }
    Column{

        CountryCodePicker(
            pickedCountry = {
                defaultLang = it.countryCode
            },
            defaultCountry = getLibCountries().single { it.countryCode == defaultLang },
            dialogAppBarTextColor = Black,
            dialogAppBarColor = DarkGray,
            text = phoneNumber.value,
            onValueChange = { phoneNumber.value = it }
        )
    }
}