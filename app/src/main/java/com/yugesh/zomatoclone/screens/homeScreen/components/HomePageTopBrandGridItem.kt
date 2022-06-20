package com.yugesh.zomatoclone.screens.homeScreen.components

import android.view.MotionEvent
import androidx.annotation.DrawableRes
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yugesh.zomatoclone.R
import com.yugesh.zomatoclone.ui.theme.zBlueColor

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun HomePageTopBrandGridItem(
    @DrawableRes iconId: Int,
    title: String,
    timeOfArrival: String,
    onCLick: () -> Unit,
    timerIconTint: Color,
    discount: String? = null
) {
    val interactionSource = remember { MutableInteractionSource() }
    val selected = remember { mutableStateOf(false) }
    val scale = animateFloatAsState(if (selected.value) 0.95f else 1f)

    Box(
        modifier = Modifier
            .width((LocalConfiguration.current.screenWidthDp / 4.25).dp)
            .fillMaxHeight()
            .padding(top = 5.dp, start = 6.dp)
            .clickable(interactionSource = interactionSource, indication = null) { onCLick() }
            .scale(scale.value)
            .pointerInteropFilter {
                when (it.action) {
                    MotionEvent.ACTION_DOWN -> {
                        selected.value = true
                    }
                    MotionEvent.ACTION_UP -> {
                        selected.value = false
                    }
                    MotionEvent.ACTION_CANCEL -> {
                        selected.value = false
                    }
                }
                true
            }
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
                                backgroundColor = zBlueColor
                            ) {
                                Text(
                                    text = discount,
                                    color = Color.White,
                                    modifier = Modifier.padding(
                                        horizontal = 8.dp,
                                        vertical = 2.dp
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
                            .padding(vertical = 8.dp, horizontal = 2.dp),
                        contentAlignment = Alignment.BottomCenter
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = title,
                                style = TextStyle(
                                    color = Color.Black
                                ),
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center,
                                modifier = Modifier.padding(bottom = 2.dp)
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
