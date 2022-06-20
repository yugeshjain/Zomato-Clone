package com.yugesh.zomatoclone.viewmodels

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.yugesh.zomatoclone.screens.homeScreen.components.HomeScreenFilterItems

class ZomatoCloneAppVm : ViewModel() {
    val selectedCategory: MutableState<HomeScreenFilterItems?> = mutableStateOf(null)
}