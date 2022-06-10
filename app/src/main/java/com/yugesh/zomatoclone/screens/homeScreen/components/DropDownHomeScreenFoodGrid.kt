package com.yugesh.zomatoclone.screens.homeScreen.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DropDownHomeScreenFoodGrid(
    headingText: String,
    content: @Composable () -> Unit
) {
    var isOpen by remember {
        mutableStateOf(false)
    }
    val alpha by animateFloatAsState(
        targetValue = if (isOpen) 180f else 0f
    )

    Card(
        backgroundColor = Color.White,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .border(BorderStroke(0.5.dp, Color.LightGray), shape = RoundedCornerShape(10.dp))
//            .animateContentSize(
//                animationSpec = tween(
//                    durationMillis = 300,
//                    easing = LinearOutSlowInEasing
//                )
//            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (isOpen) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    content()
                }
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        BorderStroke(0.dp, Color.LightGray),
                        shape = RoundedCornerShape(6.dp)
                    )
                    .background(Color.LightGray)
            ) {
                Text(
                    text = headingText,
                    color = Color.Black,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(vertical = 5.dp)
                )
                IconButton(
                    modifier = Modifier
                        .rotate(alpha),
                    onClick = {
                        isOpen = !isOpen
                    }) {
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Drop-Down Arrow"
                    )
                }
            }
        }
    }
}
