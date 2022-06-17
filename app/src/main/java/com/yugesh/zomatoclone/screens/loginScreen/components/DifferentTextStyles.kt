package com.yugesh.zomatoclone.screens.loginScreen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HeadingText(
    topHeadingFontSize: Int = 24,
    text: String,
    fontColor: Color = Color.Black
) {
    Text(
        text = text,
        fontWeight = FontWeight.Bold,
        fontSize = topHeadingFontSize.sp,
        color = fontColor
    )
}

@Composable
fun UnderlinedText(
    text: String,
    fontSize: Int = 11,
    fontColor: Color = Color.Black,
    textStyle: TextStyle = TextStyle(textDecoration = TextDecoration.Underline),
    onClick: () -> Unit
) {
    Text(
        text = text,
        style = textStyle,
        color = fontColor,
        fontSize = fontSize.sp,
        modifier = Modifier
            .padding(end = 5.dp)
            .clickable { onClick() }
    )
}
