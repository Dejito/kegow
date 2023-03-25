package com.example.kegowpg.UI_

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.kegowpg.UI_.Screens.LoginScreen
import com.example.kegowpg.UI_.Screens.SignUp


enum class KegowScreens(){ Login, Signup}

@Composable
fun KegowAppBar(canNavigate: Boolean, navigateUp: ()-> Unit, modifier: Modifier = Modifier) {
    TopAppBar(
        title = { Text(text = "")},
        navigationIcon = {
            if(canNavigate)
                IconButton(onClick = navigateUp) {
                Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = null)
            }
        }
    )
}


@Composable
fun KegowApp(modifier: Modifier = Modifier, viewmodel: KegowViewmodel = viewModel()) {

    val navController = rememberNavController()
    Scaffold(
        topBar = {Text("")}
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = KegowScreens.Login.name,
            modifier = modifier.padding(innerPadding)
        ) {
            composable(route = KegowScreens.Login.name) {
                LoginScreen(
                    onButtonClicked = { navController.navigate(KegowScreens.Signup.name) },
                    phoneNumberText = viewmodel.loginPhoneNumber,
                    phoneNumberTextChanged = { viewmodel.loginPhoneNumberChanged(it) },
                    pinTextChanged = {viewmodel.pinNumberChnaged(it)},
                    pinText = viewmodel.pinText,

                    )
            }
            composable(route = KegowScreens.Signup.name) {
                SignUp()
            }
        }
    }
}