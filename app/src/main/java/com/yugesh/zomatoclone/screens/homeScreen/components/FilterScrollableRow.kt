package com.yugesh.zomatoclone.screens.homeScreen.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.yugesh.zomatoclone.ui.theme.PrimeOne

@Composable
fun FilterScrollableRow() {
    var selectedChipIndex by remember {
        mutableStateOf(1)
    }
    Surface {
        LazyRow(
            modifier = Modifier
                .background(Color.White)
                .padding(horizontal = 10.dp),
        ) {
            items(1) {
                FilterCard(
                    text = "Sort",
                    leadingIcon = Icons.Default.Info,
                    trailingIcon = Icons.Filled.ArrowDropDown,
                    int = 1,
                    test = selectedChipIndex,
                    onClick = { selectedChipIndex = 1 }
                )
            }
            items(1) {
                FilterCard(
                    text = "Fast Delivery",
                    int = 2,
                    test = selectedChipIndex,
                    onClick = { selectedChipIndex = 2 }
                )
            }
            items(1) {
                FilterCard(
                    text = "Pure Veg",
                    int = 3,
                    test = selectedChipIndex,
                    onClick = { selectedChipIndex = 3 }
                )
            }
            items(1) {
                FilterCard(
                    text = "Rating 4.0+",
                    int = 4,
                    test = selectedChipIndex,
                    onClick = { selectedChipIndex = 4 }
                )
            }
            items(1) {
                FilterCard(
                    text = "MAX Safety",
                    int = 5,
                    test = selectedChipIndex,
                    onClick = { selectedChipIndex = 5 }
                )
            }
            items(1) {
                FilterCard(
                    text = "Cuisines",
                    trailingIcon = Icons.Filled.ArrowDropDown,
                    int = 6,
                    test = selectedChipIndex,
                    onClick = { selectedChipIndex = 6 }
                )
            }
            items(1) {
                FilterCard(
                    text = "New Arrivals",
                    int = 5,
                    test = selectedChipIndex,
                    onClick = { selectedChipIndex = 5 }
                )
            }
            items(1) {
                FilterCard(
                    text = "More",
                    trailingIcon = Icons.Filled.ArrowDropDown,
                    int = 5,
                    test = selectedChipIndex,
                    onClick = { selectedChipIndex = 5 }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun FilterCard(
    text: String,
    leadingIcon: ImageVector? = null,
    trailingIcon: ImageVector? = null,
    leadingIconContentDescription: String? = "",
    trailingIconContentDescription: String? = "",
    onClick: () -> Unit,
    test: Int,
    int: Int
) {
    var selectedChipIndex by remember {
        mutableStateOf(test)
    }
    Card(
        modifier = Modifier.padding(5.dp),
        shape = RoundedCornerShape(10.dp),
        border = if (selectedChipIndex == int) {
            BorderStroke(0.5.dp, Color.Red)
        } else {
            BorderStroke(0.5.dp, Color.LightGray)
        },
        onClick = { onClick },
        backgroundColor = if (selectedChipIndex == int) {
            Color(0xFFFFEBEB)
        } else {
            Color.White
        }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.padding(horizontal = 5.dp)
        ) {
            if (leadingIcon != null) {
                Icon(
                    imageVector = leadingIcon,
                    contentDescription = leadingIconContentDescription,
                    tint = PrimeOne
                )
            }
            Text(text = text, color = Color.Black, modifier = Modifier.padding(6.dp))
            if (trailingIcon != null) {
                Icon(
                    imageVector = trailingIcon,
                    contentDescription = trailingIconContentDescription,
                    tint = PrimeOne
                )
            }
        }
    }
}
