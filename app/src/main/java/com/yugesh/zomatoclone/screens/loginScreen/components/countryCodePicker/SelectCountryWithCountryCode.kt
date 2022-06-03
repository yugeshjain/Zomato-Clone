package com.yugesh.zomatoclone.screens.loginScreen.components.countryCodePicker

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.LocalContext

@Composable
fun SelectCountryWithCountryCode() {
    val context = LocalContext.current
    val phoneNumber = rememberSaveable { mutableStateOf("") }
    var defaultLang by rememberSaveable { mutableStateOf(getDefaultLangCode(context)) }
    var isValidPhone by remember { mutableStateOf(true) }
    Column{

        CountryCodePicker(
            pickedCountry = {
                defaultLang = it.countryCode
            },
            defaultCountry = getLibCountries().single { it.countryCode == defaultLang },
            focusedBorderColor = androidx.compose.material.MaterialTheme.colors.primary,
            unfocusedBorderColor = androidx.compose.material.MaterialTheme.colors.primary,
            dialogAppBarTextColor = Black,
            dialogAppBarColor = White,
            error = isValidPhone,
            text = phoneNumber.value,
            onValueChange = { phoneNumber.value = it }
        )
    }
}