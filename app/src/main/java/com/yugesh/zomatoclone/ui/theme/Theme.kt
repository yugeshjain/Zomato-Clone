package com.yugesh.zomatoclone.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val LightColorPalette = ZomatoCloneColorPalette(
    brand = zRedColor,
    accent = zRedColor,
    uiBackground = zSystemTopAppBarBgColor,
    textPrimary = zBlack,
    textSecondary = zLightGray,
    statusBarColor = zSystemTopAppBarBgColor,
    isDark = false,
    buttonColor = zRedColor,
    buttonTextColor = zWhite,
    appBarIconColor = zRedColor,
    appBarColor = Color.Transparent
)

private val DarkColorPalette = ZomatoCloneColorPalette(
    brand = zRedColor,
    accent = zRedColor,
    uiBackground = zSystemTopAppBarBgColor,
    textPrimary = zBlack,
    textSecondary = zLightGray,
    statusBarColor = zSystemTopAppBarBgColor,
    isDark = false,
    buttonColor = zRedColor,
    buttonTextColor = zWhite,
    appBarIconColor = zRedColor,
    appBarColor = Color.Transparent
)

@Composable
fun ZomatoCloneTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (isDarkTheme) DarkColorPalette else LightColorPalette
    val sysUiController = rememberSystemUiController()

    SideEffect {
        sysUiController.setSystemBarsColor(color = colors.appBarColor)
        sysUiController.setNavigationBarColor(color = colors.appBarColor)
    }

    ProvideZomatoCloneColors(colors) {
        MaterialTheme(
            colors = debugColors(isDarkTheme),
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}

object ZomatoCloneColorProvider {
    val colors: ZomatoCloneColorPalette
        @Composable
        get() = LocalZomatoCloneColor.current
}

/**
 * ZomatoClone custom Color Palette
 */
@Stable
class ZomatoCloneColorPalette(
    brand: Color,
    accent: Color,
    uiBackground: Color,
    textPrimary: Color,
    textSecondary: Color,
    statusBarColor: Color,
    isDark: Boolean,
    buttonColor: Color,
    buttonTextColor: Color,
    appBarIconColor: Color,
    appBarColor: Color
) {
    var brand by mutableStateOf(brand)
        private set
    var accent by mutableStateOf(accent)
        private set
    var uiBackground by mutableStateOf(uiBackground)
        private set
    var statusBarColor by mutableStateOf(statusBarColor)
        private set
    var textPrimary by mutableStateOf(textPrimary)
        private set
    var textSecondary by mutableStateOf(textSecondary)
        private set
    var isDark by mutableStateOf(isDark)
        private set
    var buttonColor by mutableStateOf(buttonColor)
        private set
    var buttonTextColor by mutableStateOf(buttonTextColor)
        private set
    var appBarIconColor by mutableStateOf(appBarIconColor)
        private set
    var appBarColor by mutableStateOf(appBarColor)
        private set


    fun update(other: ZomatoCloneColorPalette) {
        brand = other.brand
        uiBackground = other.uiBackground
        textPrimary = other.textPrimary
        textSecondary = other.textSecondary
        statusBarColor = other.statusBarColor
        isDark = other.isDark
        buttonColor = other.buttonColor
        buttonTextColor = other.buttonTextColor
        appBarIconColor = other.appBarIconColor
        appBarColor = other.appBarColor
    }
}

@Composable
fun ProvideZomatoCloneColors(
    colors: ZomatoCloneColorPalette,
    content: @Composable () -> Unit
) {
    val colorPalette = remember { colors }
    colorPalette.update(colors)
    CompositionLocalProvider(LocalZomatoCloneColor provides colorPalette, content = content)
}

private val LocalZomatoCloneColor = staticCompositionLocalOf<ZomatoCloneColorPalette> {
    error("No ZomatoCloneColorPalette provided")
}

/**
 * A Material [Colors] implementation which sets all colors to [debugColor] to discourage usage of
 * [MaterialTheme.colors] in preference to [ZomatoCloneColorProvider.colors].
 */
fun debugColors(
    darkTheme: Boolean,
    debugColor: Color = Color.Red
) = Colors(
    primary = debugColor,
    primaryVariant = debugColor,
    secondary = debugColor,
    secondaryVariant = debugColor,
    background = debugColor,
    surface = debugColor,
    error = debugColor,
    onPrimary = debugColor,
    onSecondary = debugColor,
    onBackground = debugColor,
    onSurface = debugColor,
    onError = debugColor,
    isLight = !darkTheme
)