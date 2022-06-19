package com.yugesh.zomatoclone.screens.loginScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Scaffold
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
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.yugesh.zomatoclone.R
import com.yugesh.zomatoclone.screens.destinations.HomeScreenDestination
import com.yugesh.zomatoclone.screens.loginScreen.components.HeadingText
import com.yugesh.zomatoclone.screens.loginScreen.components.LoginForm
import com.yugesh.zomatoclone.screens.loginScreen.components.LoginScreenBottomInfoBar
import com.yugesh.zomatoclone.screens.loginScreen.components.LoginTextDivider
import com.yugesh.zomatoclone.screens.loginScreen.components.OrTextDivider
import com.yugesh.zomatoclone.screens.loginScreen.components.RoundButton
import com.yugesh.zomatoclone.screens.loginScreen.components.UnderlinedText
import com.yugesh.zomatoclone.screens.loginScreen.components.countryCodePicker.SelectCountryWithCountryCode

@Destination(start = true)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun LoginScreen(
    navigator: DestinationsNavigator
) {
    Scaffold(
        backgroundColor = Color.White,
        modifier = Modifier.fillMaxSize(),
        bottomBar = { }
    ) {
        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .verticalScroll(state = rememberScrollState())
        ) {
            LoginForm(navigator = navigator)
            LoginScreenBottomInfoBar()
        }
    }
}
