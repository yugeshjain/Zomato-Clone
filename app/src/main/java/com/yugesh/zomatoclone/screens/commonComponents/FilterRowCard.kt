package com.yugesh.zomatoclone.screens.commonComponents

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.yugesh.zomatoclone.ui.theme.PrimeOne

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun FilterRowCard(
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