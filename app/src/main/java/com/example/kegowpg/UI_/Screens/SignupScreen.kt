package com.example.kegowpg.UI_.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.w3c.dom.Text

@Composable
fun SignUp(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.padding(start = 10.dp, end = 10.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
        Row(modifier = Modifier) {
            Text(text = "Create a ")
            Text(text = "Kegow ")
        }
        Text(text = "account", )
    }
}