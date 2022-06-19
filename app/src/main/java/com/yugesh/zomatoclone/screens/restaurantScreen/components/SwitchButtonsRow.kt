package com.yugesh.zomatoclone.screens.restaurantScreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yugesh.zomatoclone.R
import com.yugesh.zomatoclone.ui.theme.zGreenColor

@Composable
fun SwitchButtonsRow(
    isPureVegetarian: Boolean = false
) {
    val vegButtonCheckedState = remember { mutableStateOf(false) }
    val nonVegButtonCheckedState = remember { mutableStateOf(false) }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        if (isPureVegetarian) {
            Row(modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(6.dp))
                        .background(zGreenColor)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier.padding(vertical = 3.dp, horizontal = 5.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.leaf_vector),
                            contentDescription = stringResource(R.string.pure_veg),
                            tint = Color.White,
                            modifier = Modifier
                                .size(14.dp)
                                .padding(end = 1.dp)
                        )
                        Text(
                            text = stringResource(R.string.pure_veg),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White
                        )
                    }
                }
            }
        } else {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
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
}