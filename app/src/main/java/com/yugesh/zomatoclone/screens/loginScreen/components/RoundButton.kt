package com.yugesh.zomatoclone.screens.loginScreen.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun RoundButton(
    iconsOutline: Dp = 50.dp,
    iconsSize: Dp = 25.dp,
    text: String,
    image: Painter,
    onClick: () -> Unit
) {

    Button(
        onClick = { onClick() },
        shape = CircleShape,
        contentPadding = PaddingValues(5.dp),
        modifier = Modifier
            .padding(top = 5.dp, start = 7.dp, end = 7.dp)
            .size(height = iconsOutline, width = iconsOutline),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
        border = BorderStroke(0.5.dp, Color(0xFFDAD9D9)),
        elevation = ButtonDefaults.elevation(0.dp)
    ) {
        Image(
            modifier = Modifier.size(height = iconsSize, width = iconsSize),
            painter = image,
            contentDescription = text
        )
    }
}
