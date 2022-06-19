package com.yugesh.zomatoclone.screens.loginScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.yugesh.zomatoclone.R
import com.yugesh.zomatoclone.screens.destinations.HomeScreenDestination
import com.yugesh.zomatoclone.screens.loginScreen.components.countryCodePicker.SelectCountryWithCountryCode
import com.yugesh.zomatoclone.ui.theme.zSkipButtonBgColor
import com.yugesh.zomatoclone.ui.theme.zWhite

@Composable
fun LoginForm(
    navigator: DestinationsNavigator
) {

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
                onClick = { navigator.navigate(HomeScreenDestination) },
                modifier = Modifier
                    .padding(30.dp)
                    .alpha(skipButtonAlpha)
                    .blur(90.dp),
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = zSkipButtonBgColor)
            ) {
                Text(
                    text = stringResource(R.string.skip_button_text),
                    fontSize = skipButtonFontSize,
                    modifier = Modifier.alpha(skipButtonAlpha),
                    color = zWhite
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

            SelectCountryWithCountryCode(navigator = navigator)

            Button(
                onClick = { navigator.navigate(HomeScreenDestination) },
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
