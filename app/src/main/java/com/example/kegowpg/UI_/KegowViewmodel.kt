package com.example.kegowpg.UI_

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class KegowViewmodel: ViewModel(){

    var loginPhoneNumber by mutableStateOf( "")
    var pinText by mutableStateOf("")
    var checkBoxedClicked by mutableStateOf(Boolean)

    fun loginPhoneNumberChanged (updatedNumber: String){
         loginPhoneNumber = updatedNumber
    }

    fun pinNumberChnaged (updatedNumber: String){
        pinText = updatedNumber
    }

    fun checkBoxPressed(checked: Boolean) {
//        checkBoxedClicked = checked.
    }

}