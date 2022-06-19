package com.yugesh.zomatoclone.screens.loginScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.yugesh.zomatoclone.screens.loginScreen.components.LoginForm
import com.yugesh.zomatoclone.screens.loginScreen.components.LoginScreenBottomInfoBar

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
