package com.yugesh.zomatoclone.screens.loginScreen.components.countryCodePicker

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.filled.Warning
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalTextInputService
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun CountryCodePicker(
    text: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    showCountryCode: Boolean = true,
    defaultCountry: CountryData,
    pickedCountry: (CountryData) -> Unit,
    dialogAppBarColor: Color = Color.DarkGray,
    dialogAppBarTextColor: Color = Color.DarkGray
) {
    var textFieldValueState by remember { mutableStateOf(TextFieldValue(text = text)) }
    val textFieldValue = textFieldValueState.copy(text = text)
    val keyboardController = LocalTextInputService.current
    Surface(
        color = color
    ) {
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.padding(bottom = 10.dp)
            )
            {
                OutlinedTextField(
                    modifier = modifier
                        .fillMaxWidth()
                        .border(1.dp, Color.LightGray, RoundedCornerShape(12.dp)),
                    value = textFieldValue,
                    onValueChange = {
                        textFieldValueState = it
                        if (text != it.text) {
                            onValueChange(it.text)
                        }
                    },
                    singleLine = true,
                    visualTransformation = PhoneNumberTransformation(defaultCountry.countryCode.uppercase()),
                    placeholder = {
                        Text(
                            text = "Enter Phone Number",
                            color = Color.DarkGray,
                            fontWeight = FontWeight.Bold
                        )
                    },
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.NumberPassword,
                        autoCorrect = true,
                    ),
                    keyboardActions = KeyboardActions(onDone = { keyboardController?.hideSoftwareKeyboard() }),
                    leadingIcon = {
                        Row {
                            Column {
                                val dialog = CodePicker()
                                dialog.CodeDialog(
                                    pickedCountry = pickedCountry,
                                    defaultSelectedCountry = defaultCountry,
                                    dialogAppBarColor = dialogAppBarColor,
                                    showCountryCode = showCountryCode,
                                    dialogAppBarTextColor = dialogAppBarTextColor
                                )
                            }
                        }
                    }
                )
            }
        }
    }
}