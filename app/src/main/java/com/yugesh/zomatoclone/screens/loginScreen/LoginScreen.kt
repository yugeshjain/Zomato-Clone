package com.yugesh.zomatoclone.screens.loginScreen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yugesh.zomatoclone.R
import com.yugesh.zomatoclone.screens.loginScreen.components.TextDivider
import com.yugesh.zomatoclone.screens.loginScreen.components.countryCodePicker.SelectCountryWithCountryCode

@Composable
fun LoginScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {
        LoginForm()
    }
}

@Composable
fun LoginForm() {
    Column(
        modifier = Modifier.padding(40.dp)
    ) {
        Text(
            text = "India's #1 Food Delivery \nand Dining App",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )

        TextDivider(text = "Log in or sign up")

        SelectCountryWithCountryCode()

        Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Continue")
        }

        TextDivider(text = "or")

        Row {
            Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(90.dp)) {
                Icon(painter = painterResource(id = R.drawable.id), contentDescription = "")
            }
            Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(90.dp)) {
                Icon(painter = painterResource(id = R.drawable.id), contentDescription = "")
            }
        }

    }
}