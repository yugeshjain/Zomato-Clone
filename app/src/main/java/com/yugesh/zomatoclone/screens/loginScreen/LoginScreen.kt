package com.yugesh.zomatoclone.screens.loginScreen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yugesh.zomatoclone.R
import com.yugesh.zomatoclone.screens.loginScreen.components.*
import com.yugesh.zomatoclone.screens.loginScreen.components.countryCodePicker.SelectCountryWithCountryCode

@Composable
fun LoginScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = { BottomInfoBar() }
    ) {
        LoginForm()
    }
}

@Composable
fun LoginForm() {

    val skipButtonFontSize = 12.sp
    val skipButtonAlpha = 0.8f

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(contentAlignment = Alignment.TopEnd) {

            Image(
                painter = painterResource(id = R.drawable.login_page_top_image),
                contentDescription = "Login Page Top Image"
            )

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(30.dp)
                    .alpha(skipButtonAlpha)
                    .blur(90.dp),
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF313131))
            ) {
                Text(
                    text = stringResource(R.string.skip_button_text),
                    fontSize = skipButtonFontSize,
                    modifier = Modifier.alpha(skipButtonAlpha)
                )
            }
        }
        Column(
            modifier = Modifier
                .padding(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HeadingText(
                text = stringResource(R.string.login_page_top_heading_one)
            )
            HeadingText(
                text = stringResource(R.string.login_page_top_heading_two)
            )

            LoginTextDivider()

            SelectCountryWithCountryCode()

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    text = stringResource(R.string.continue_button_text),
                    modifier = Modifier.padding(6.dp),
                    color = Color.White
                )
            }

            OrTextDivider()

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                RoundButton(
                    text = stringResource(R.string.google_logo),
                    image = painterResource(id = R.drawable.google_logo)
                ) {
                    /*TODO*/
                }
                RoundButton(
                    text = stringResource(R.string.three_dots_logo),
                    image = painterResource(id = R.drawable.ic_three_dots)
                ) {
                    /*TODO*/
                }
            }
        }
    }
}


@Composable
fun BottomInfoBar() {
    val fontSize = 11.sp
    val fontColor: Color = Color.Black

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(bottom = 26.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = stringResource(R.string.by_continuing_you_agree_to_our),
            color = fontColor,
            fontSize = fontSize
        )
        Row(
            horizontalArrangement = Arrangement.Center
        ) {
            UnderlinedText(text = stringResource(R.string.terms_of_service), onClick = {})
            UnderlinedText(text = stringResource(R.string.privacy_policy), onClick = {})
            UnderlinedText(text = stringResource(R.string.content_policy), onClick = {})
        }
    }
}