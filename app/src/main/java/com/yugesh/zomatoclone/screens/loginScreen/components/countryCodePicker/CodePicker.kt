package com.yugesh.zomatoclone.screens.loginScreen.components.countryCodePicker

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalTextInputService
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.yugesh.zomatoclone.R

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun CodeDialog(
    modifier: Modifier = Modifier,
    padding: Dp = 15.dp,
    defaultSelectedCountry: CountryData = getLibCountries().first(),
    showCountryCode: Boolean = true,
    pickedCountry: (CountryData) -> Unit
) {
    val countryList: List<CountryData> = getLibCountries()
    var isPickCountry by remember { mutableStateOf(defaultSelectedCountry) }
    var isOpenDialog by remember { mutableStateOf(false) }
    var searchValue by remember { mutableStateOf("") }
    var isSearch by remember { mutableStateOf(true) }
    val context = LocalContext.current
    val interactionSource = remember { MutableInteractionSource() }

    Column(
        modifier = Modifier
            .padding(padding)
            .clickable(
                interactionSource = interactionSource,
                indication = null
            ) { isOpenDialog = true },
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = modifier.width(34.dp),
                painter = painterResource(
                    id = getFlags(
                        isPickCountry.countryCode
                    )
                ), contentDescription = null
            )
            if (showCountryCode) {
                Text(
                    text = isPickCountry.countryPhoneCode,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 6.dp),
                    color = Color.Black
                )
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = null,
                    tint = Color.Black
                )
            }
        }
    }

    //Select Country Dialog
    if (isOpenDialog) {
        Dialog(
            onDismissRequest = { isOpenDialog = false },
            properties = DialogProperties(
                usePlatformDefaultWidth = false
            ),
        ) {
            Scaffold(
                backgroundColor = Color.White,
                topBar = {
                    TopAppBar(
                        backgroundColor = Color.White,
                        title = { },
                        navigationIcon = {
                            IconButton(onClick = { }) {
                                Icon(
                                    imageVector = Icons.Rounded.ArrowBack,
                                    contentDescription = "Back",
                                    tint = Color.Black
                                )
                            }
                        },
                        actions = { }
                    )
                }
            ) {
                Column(
                    modifier = Modifier.padding(
                        horizontal = 18.dp
                    ).background(Color.White)
                ) {
                    SearchTextField(
                        value = searchValue,
                        onValueChange = { searchValue = it },
                        leadingIcon = {
                            Icon(
                                Icons.Filled.Search,
                                null,
                                tint = Color.Black,
                                modifier = Modifier.padding(horizontal = 3.dp),
                            )
                        },
                        modifier = Modifier
                            .background(
                                Color.LightGray,
                            )
                            .height(40.dp)
                            .clip(RoundedCornerShape(15.dp))
                            .padding(bottom = 5.dp),
                        fontSize = 16.sp
                    )
                    it.calculateTopPadding()
                    Surface(modifier = modifier.fillMaxSize()) {
                        Card(
                            Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .padding(top = 5.dp),
                        ) {
                            Column(
                                modifier = Modifier.background(Color.White)
                            ) {
                                LazyColumn {
                                    items(
                                        (if (searchValue.isEmpty()) {
                                            countryList
                                        } else {
                                            countryList.searchCountry(
                                                searchValue,
                                                context = context
                                            )
                                        })
                                    ) { countryItem ->
                                        Column {
                                            Row(
                                                Modifier
                                                    .padding(
                                                        vertical = 8.dp
                                                    )
                                                    .fillMaxWidth()
                                                    .clickable {
                                                        pickedCountry(countryItem)
                                                        isPickCountry = countryItem
                                                        isOpenDialog = false
                                                        searchValue = ""
                                                        isSearch = false
                                                    },
                                                horizontalArrangement = Arrangement.Start,
                                                verticalAlignment = Alignment.CenterVertically
                                            ) {
                                                Image(
                                                    modifier = modifier
                                                        .width(30.dp)
                                                        .clip(
                                                            RoundedCornerShape(3.dp)
                                                        ),
                                                    painter = painterResource(
                                                        id = getFlags(
                                                            countryItem.countryCode
                                                        )
                                                    ), contentDescription = null
                                                )
                                                Text(
                                                    stringResource(
                                                        id = getCountryName(
                                                            countryItem.countryCode.lowercase()
                                                        )
                                                    ),
                                                    Modifier.padding(horizontal = 18.dp),
                                                    color = Color.Black
                                                )
                                            }
                                            Divider(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .alpha(0.25f),
                                                color = Color.LightGray,
                                                thickness = 2.dp
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun SearchTextField(
    modifier: Modifier = Modifier,
    leadingIcon: (@Composable () -> Unit)? = null,
    value: String,
    onValueChange: (String) -> Unit,
    fontSize: TextUnit = MaterialTheme.typography.body2.fontSize
) {

    BasicTextField(
        modifier = modifier
        .fillMaxWidth(),
        value = value,
        onValueChange = onValueChange,
        singleLine = true,
        cursorBrush = SolidColor(MaterialTheme.colors.primary),
        textStyle = LocalTextStyle.current.copy(
            color = Color.Black,
            fontSize = fontSize
        ),
        decorationBox = {
            Row(
                modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (leadingIcon != null) leadingIcon()
                Box(Modifier.weight(1f)) {
                    if (value.isEmpty()) Text(
                        stringResource(id = R.string.search),
                        style = LocalTextStyle.current.copy(
                            color = Color.Black,
                            fontSize = fontSize
                        )
                    )
                    it()
                }
            }
        }
    )
}
