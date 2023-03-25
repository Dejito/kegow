package com.example.kegowpg.UI_.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kegowpg.R

@Composable
fun LoginScreen(
    phoneNumberText: String,
    phoneNumberTextChanged: (String) -> Unit,
    pinTextChanged: (String)-> Unit,
    pinText: String,
    onButtonClicked: () -> Unit,
    onPhoneNumberKeyboardDone: () -> Unit = {},
    modifier: Modifier = Modifier
                    ) {
    val focusManager = LocalFocusManager.current
    Column( modifier = modifier.padding(end = 20.dp, start = 20.dp),
//             horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {

        Divider(
            Modifier
                .height(10.dp)
                .padding(), color = Color.White)

        Box(contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()
            ) {
            Image(
                painter = painterResource(id = R.drawable.kegow_logo_2),
                contentDescription = "Kegow Logo",
                modifier = Modifier.size(width = 200.31.dp, height = 120.88.dp)
            )
        }

        Divider(Modifier.height(40.dp), color = Color.White)

        OutlinedTextField(
            value = phoneNumberText,
            onValueChange = phoneNumberTextChanged,
            label = {Text("Phone Number")},
            singleLine = true,
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Next
            ),
            keyboardActions = KeyboardActions(
                onNext = {focusManager.moveFocus(FocusDirection.Down)}
            ),

            modifier = Modifier
                .fillMaxWidth()
//                .clip(RoundedCornerShape(25))
            )

       OutlinedTextField(
           value = pinText,
           onValueChange = pinTextChanged,
           label = { Text(text = "PIN")},
           keyboardOptions = KeyboardOptions.Default.copy(
               imeAction = ImeAction.Done
           ),
           keyboardActions = KeyboardActions(
               onDone = {onPhoneNumberKeyboardDone}
           ),
           trailingIcon = {
               Icon(imageVector = Icons.Filled.Face, contentDescription = null)
           },
           modifier = Modifier.fillMaxWidth()
       )
        Row(modifier = Modifier) {
            Checkbox(checked = c, onCheckedChange = {})
            Text(text = "Remember PIN")
        }

        Button(onClick = onButtonClicked, modifier = Modifier
            .fillMaxWidth()
            .height(52.dp)
            .clip(
                RoundedCornerShape(25),
            )) {
            Text(text = "Login", fontSize = 16.sp)
        }
    }
}
var c: Boolean = false
fun invertCheck(input: Boolean): Boolean {
      c =! input
    return c
}