package com.yugesh.zomatoclone.screens.countryPicker

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.yugesh.zomatoclone.R
import com.yugesh.zomatoclone.screens.countryPicker.components.SearchTextField
import com.yugesh.zomatoclone.screens.destinations.LoginScreenDestination
import com.yugesh.zomatoclone.screens.loginScreen.components.countryCodePicker.CountryData
import com.yugesh.zomatoclone.screens.loginScreen.components.countryCodePicker.getCountryName
import com.yugesh.zomatoclone.screens.loginScreen.components.countryCodePicker.getFlags
import com.yugesh.zomatoclone.screens.loginScreen.components.countryCodePicker.getLibCountries
import com.yugesh.zomatoclone.screens.loginScreen.components.countryCodePicker.searchCountry


@Destination
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CountryPickerScreen(
    navigator: DestinationsNavigator,
    defaultSelectedCountry: CountryData = getLibCountries().first(),
    pickedCountry: (CountryData) -> Unit
) {

    var searchValue by remember { mutableStateOf("") }
    val countryList: List<CountryData> = getLibCountries()
    val context = LocalContext.current
    var isPickCountry by remember { mutableStateOf(defaultSelectedCountry) }
    var isSearch by remember { mutableStateOf(true) }
    val bgColor = Color(0xFFEEEEEE)


    Scaffold(
        backgroundColor = bgColor,
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                modifier = Modifier.padding(top = 35.dp),
                backgroundColor = Color.White,
                title = { },
                navigationIcon = {
                    IconButton(onClick = { navigator.navigate(LoginScreenDestination) }) {
                        Icon(
                            imageVector = Icons.Rounded.ArrowBack,
                            contentDescription = "Back",
                            tint = Color.Black
                        )
                    }
                },
                elevation = 0.dp
            )
        }
    ) {
        Column(
            modifier = Modifier.background(Color.White)
        ) {
            SearchTextField(
                placeholder = stringResource(id = R.string.search),
                value = searchValue,
                onValueChange = { searchValue = it },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = "Search TextField Button",
                        tint = Color.DarkGray,
                        modifier = Modifier.padding(horizontal = 3.dp)
                    )
                }
            )
            Text(
                text = "Select Your Country",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 15.sp,
                modifier = Modifier
                    .padding(horizontal = 10.dp, vertical = 5.dp)
            )
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .alpha(0.25f),
                color = Color.LightGray,
                thickness = 2.dp
            )
            LazyColumn(
                modifier = Modifier.padding(horizontal = 18.dp)
            ) {
                items(
                    if (searchValue.isEmpty()) {
                        countryList
                    } else {
                        countryList.searchCountry(
                            searchValue,
                            context = context
                        )
                    }
                ) { countryItem ->
                    Column {
                        Row(
                            modifier = Modifier
                                .padding(vertical = 8.dp)
                                .fillMaxWidth()
                                .clickable {
                                    pickedCountry(countryItem)
                                    isPickCountry = countryItem
                                    searchValue = ""
                                    isSearch = false
                                    navigator.navigate(LoginScreenDestination)
                                },
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(3.dp))
                                    .size(30.dp),
                                painter = painterResource(id = getFlags(countryItem.countryCode)),
                                contentDescription = null
                            )
                            Text(
                                text = stringResource(
                                    id = getCountryName(countryItem.countryCode.lowercase())
                                ),
                                modifier = Modifier.padding(horizontal = 18.dp),
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
