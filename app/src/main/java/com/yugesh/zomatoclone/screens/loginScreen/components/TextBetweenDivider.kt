package com.yugesh.zomatoclone.screens.loginScreen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yugesh.zomatoclone.R

private const val DividerAlpha = 0.25f
private val DividerThickness: Dp = 2.dp
private val dividerColor: Color = Color.LightGray

@Composable
fun LoginTextDivider() {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 20.dp, top = 20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Divider(
            modifier = Modifier
                .fillMaxWidth(0.35f)
                .alpha(DividerAlpha)
                .padding(6.dp),
            color = dividerColor,
            thickness = DividerThickness
        )
        Text(
            text = stringResource(R.string.login_or_signup),
            color = Color.DarkGray,
            style = MaterialTheme.typography.body2,
            fontWeight = FontWeight.Bold
        )
        Divider(
            modifier = Modifier
                .fillMaxWidth(1f)
                .alpha(DividerAlpha)
                .padding(6.dp),
            color = dividerColor,
            thickness = DividerThickness
        )
    }
}

@Composable
fun OrTextDivider() {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp, bottom = 20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Divider(
            modifier = Modifier
                .fillMaxWidth(0.48f)
                .alpha(DividerAlpha)
                .padding(6.dp),
            color = dividerColor,
            thickness = DividerThickness
        )
        Text(
            text = stringResource(R.string.or_divider_text),
            color = Color.DarkGray,
            style = MaterialTheme.typography.body2,
            fontWeight = FontWeight.Bold
        )
        Divider(
            modifier = Modifier
                .fillMaxWidth(1f)
                .alpha(DividerAlpha)
                .padding(6.dp),
            color = dividerColor,
            thickness = DividerThickness
        )
    }
}
