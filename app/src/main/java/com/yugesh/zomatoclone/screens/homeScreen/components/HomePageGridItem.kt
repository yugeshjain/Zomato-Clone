package com.yugesh.zomatoclone.screens.homeScreen.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yugesh.zomatoclone.R

@Composable
fun HomePageGridItem(
    @DrawableRes iconId: Int,
    title: String,
    timeOfArrival: String,
    onCLick: () -> Unit,
    timerIconTint: Color,
    discount: String? = null
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
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
                            border = BorderStroke(1.dp, Color.LightGray),
                            backgroundColor = Color.White,
                            modifier = Modifier.padding(bottom = 5.dp)
                        ) {
                            Image(
                                painter = painterResource(id = iconId),
                                contentDescription = "$title + Logo"
                            )
                        }

                        if (discount != null) {
                            Card(
                                modifier = Modifier.padding(top = 15.dp),
                                backgroundColor = Color(0xFF2748FF)
                            ) {
                                Text(
                                    text = discount,
                                    color = Color.White,
                                    modifier = Modifier.padding(
                                        horizontal = 10.dp,
                                        vertical = 5.dp
                                    ),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp),
                        contentAlignment = Alignment.BottomCenter
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                title,
                                style = TextStyle(
                                    color = Color.Black
                                ),
                                textAlign = TextAlign.Center
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_baseline_timer_24),
                                    contentDescription = "Timer",
                                    tint = timerIconTint
                                )
                                Text(text = timeOfArrival, color = Color.DarkGray, fontSize = 10.sp)
                            }
                        }
                    }
                }
            }
        }
    }
}
