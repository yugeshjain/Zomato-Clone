package com.yugesh.zomatoclone.screens.restaurantScreen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SwitchButtonsRow() {
    val vegButtonCheckedState = remember { mutableStateOf(false) }
    val nonVegButtonCheckedState = remember { mutableStateOf(false) }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.padding(start = 6.dp, end = 12.dp)
        ) {
            Switch(
                checked = vegButtonCheckedState.value,
                onCheckedChange = { vegButtonCheckedState.value = it },
                colors = SwitchDefaults.colors(
                    checkedThumbColor = Color(0xFF63B260),
                    checkedTrackColor = Color(0xFFCDE7CE),
                    uncheckedThumbColor = Color(0xFFB5B4B4),
                    uncheckedTrackColor = Color(0xFFE8E8E9)
                ),
                modifier = Modifier.padding(end = 4.dp)
            )
            Text(
                text = "Veg",
                color = Color.DarkGray,
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Switch(
                checked = nonVegButtonCheckedState.value,
                onCheckedChange = { nonVegButtonCheckedState.value = it },
                colors = SwitchDefaults.colors(
                    checkedThumbColor = Color(0xFFCE444D),
                    checkedTrackColor = Color(0xFFEFC6C7),
                    uncheckedThumbColor = Color(0xFFB5B4B4),
                    uncheckedTrackColor = Color(0xFFE8E8E9)
                ),
                modifier = Modifier.padding(end = 4.dp)
            )
            Text(
                text = "Non-Veg",
                color = Color.DarkGray,
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}