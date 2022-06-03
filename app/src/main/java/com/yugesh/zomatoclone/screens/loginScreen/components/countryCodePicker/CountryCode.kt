package com.yugesh.zomatoclone.screens.loginScreen.components.countryCodePicker

import com.yugesh.zomatoclone.R
import java.util.*

data class CountryData(
    private var cCodes: String,
    val countryPhoneCode: String = "+90",
    val cNames:String = "tr",
    val flagResID: Int = R.drawable.`in`
) {
    val countryCode = cCodes.lowercase(Locale.getDefault())
}
