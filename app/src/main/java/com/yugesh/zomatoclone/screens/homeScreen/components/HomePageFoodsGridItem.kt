package com.yugesh.zomatoclone.screens.homeScreen.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun HomePageFoodsGridItem(
    @DrawableRes iconId: Int,
    title: String,
    onCLick: () -> Unit
) {
    Box(
        modifier = Modifier
            .width((LocalConfiguration.current.screenWidthDp / 4.25).dp)
            .fillMaxHeight()
            .padding(top = 5.dp, start = 6.dp)
            .clickable { onCLick }
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth(0.95f),
            elevation = 0.dp,
            backgroundColor = Color.White
        ) {
            Box {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxHeight(0.95f)
                            .align(Alignment.CenterHorizontally),
                        contentAlignment = Alignment.BottomCenter
                    ) {
                        Card(
                            shape = CircleShape,
                            backgroundColor = Color.White,
                            modifier = Modifier.padding(bottom = 5.dp),
                            elevation = 0.dp
                        ) {
                            Image(
                                painter = painterResource(id = iconId),
                                contentDescription = "$title + Logo"
                            )
                        }
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(bottom = 8.dp, start = 8.dp, end = 8.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = title,
                            fontWeight = FontWeight.Bold,
                            style = TextStyle(
                                color = Color.DarkGray
                            ),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }
}
