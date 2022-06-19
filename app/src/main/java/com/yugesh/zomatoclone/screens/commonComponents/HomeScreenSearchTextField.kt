package com.yugesh.zomatoclone.screens.commonComponents

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yugesh.zomatoclone.R
import com.yugesh.zomatoclone.screens.countryPicker.components.SearchTextField
import com.yugesh.zomatoclone.ui.theme.zDarkGray
import com.yugesh.zomatoclone.ui.theme.zRedColor

@Composable
fun AppMainSearchTextField() {
    var textValue by remember { mutableStateOf("") }
    val iconSize: Dp = 20.dp

    SearchTextField(
        placeholder = "Restaurant name or a dish...",
        value = textValue,
        onValueChange = { textValue = it },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search Button",
                tint = zRedColor,
                modifier = Modifier.padding(horizontal = 3.dp)
            )
        },
        trailingIcon = {
            Row {
                Divider(
                    color = zDarkGray,
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(1.dp)
                        .padding(horizontal = 5.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.mic_png),
                    contentDescription = "Mic Button",
                    tint = zRedColor,
                    modifier = Modifier
                        .padding(horizontal = 3.dp)
                        .size(iconSize)
                )
            }
        }
    )
}
