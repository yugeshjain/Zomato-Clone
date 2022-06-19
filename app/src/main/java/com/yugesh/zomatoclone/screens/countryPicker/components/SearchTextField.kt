package com.yugesh.zomatoclone.screens.countryPicker.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Divider
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.yugesh.zomatoclone.ui.theme.zDarkGray
import com.yugesh.zomatoclone.ui.theme.zSearchBarBgColor

@Composable
fun SearchTextField(
    leadingIcon: (@Composable () -> Unit)? = null,
    trailingIcon: (@Composable () -> Unit)? = null,
    value: String,
    onValueChange: (String) -> Unit,
    fontSize: TextUnit = MaterialTheme.typography.body2.fontSize,
    borderStrokeSize: Dp = 0.5.dp,
    borderStrokeColor: Color = Color.LightGray,
    placeholder: String
) {
    val bgColor = zSearchBarBgColor
    Surface(
        color = bgColor,
        modifier = Modifier.padding(vertical = 5.dp, horizontal = 10.dp),
        shape = RoundedCornerShape(12.dp),
        border = BorderStroke(borderStrokeSize, borderStrokeColor)
    ) {
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            BasicTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp),
                value = value,
                onValueChange = onValueChange,
                singleLine = true,
                cursorBrush = SolidColor(Color.DarkGray),
                textStyle = LocalTextStyle.current.copy(
                    color = Color.Black,
                    fontSize = fontSize
                ),
                decorationBox = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(5.dp)
                    ) {
                        if (leadingIcon != null) leadingIcon()
                        Box(Modifier.weight(1f)) {
                            if (value.isEmpty()) Text(
                                placeholder,
                                style = LocalTextStyle.current.copy(
                                    color = Color.DarkGray,
                                    fontSize = fontSize
                                )
                            )
                        }
                        if (trailingIcon != null) trailingIcon()
                    }
                },
            )
        }
    }
}

@Composable
fun SearchBarDivider(
    modifier: Modifier = Modifier
){
    Divider(
        modifier = modifier.width(1.dp),
        color = zDarkGray,
        thickness = 20.dp
    )
}
