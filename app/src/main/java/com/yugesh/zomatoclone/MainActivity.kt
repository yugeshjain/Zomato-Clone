package com.yugesh.zomatoclone

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.manualcomposablecalls.composable
import com.yugesh.zomatoclone.screens.NavGraphs
import com.yugesh.zomatoclone.screens.countryPicker.CountryPickerScreen
import com.yugesh.zomatoclone.screens.destinations.CountryPickerScreenDestination
import com.yugesh.zomatoclone.ui.theme.ZomatoCloneTheme
import com.yugesh.zomatoclone.viewmodels.SplashScreenVm

class MainActivity : ComponentActivity() {

    private val viewModel: SplashScreenVm by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);

        WindowCompat.setDecorFitsSystemWindows(window, false)
        installSplashScreen().setKeepOnScreenCondition {
            viewModel.isLoading.value
        }
        setContent {
            ZomatoCloneTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DestinationsNavHost(navGraph = NavGraphs.root) {
                        composable(destination = CountryPickerScreenDestination) {
                            CountryPickerScreen(
                                navigator = destinationsNavigator,
                                pickedCountry = {})
                        }
                    }
                }
            }
        }
    }
}
