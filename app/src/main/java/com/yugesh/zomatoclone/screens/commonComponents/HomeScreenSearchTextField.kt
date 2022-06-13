package com.yugesh.zomatoclone.screens.commonComponents

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.yugesh.zomatoclone.screens.countryPicker.components.SearchTextField
import com.yugesh.zomatoclone.ui.theme.PrimeOne

@Composable
fun AppMainSearchTextField() {
    var textValue by remember { mutableStateOf("") }

    SearchTextField(
        placeholder = "Restaurant name or a dish...",
        value = textValue,
        onValueChange = { textValue = it },
        leadingIcon = {
            Icon(
                imageVector = Icons.Filled.Search,
                contentDescription = "Search Button",
                tint = PrimeOne,
                modifier = Modifier.padding(horizontal = 3.dp)
            )
        },
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.Send,
                contentDescription = "Mic Button",
                tint = PrimeOne,
                modifier = Modifier.padding(horizontal = 3.dp)
            )
        }
    )
}
