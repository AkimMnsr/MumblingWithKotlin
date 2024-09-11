package com.example.mumblingwithkotlin.templates

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mumblingwithkotlin.component.BasicComponent
import com.example.mumblingwithkotlin.component.ButtonComponent
import com.example.mumblingwithkotlin.component.TextFieldComponent
import com.example.mumblingwithkotlin.component.TextTitleComponent

@Composable
fun SubscribePage(){
    val textFieldList = listOf("Pseudo","Email" , "Password", "Password confirmation", "City code", "Phone number")
    BasicComponent {
        Column(
            modifier = Modifier
                .padding(horizontal = 40.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.weight(0.2f))
            TextTitleComponent("Sign In")
            Spacer(Modifier.weight(0.2f))
            for (list in textFieldList) {
                TextFieldComponent(list)
            }
            Spacer(modifier = Modifier.padding(vertical = 5.dp))
            ButtonComponent("SIGN IN", {})
            Spacer(Modifier.weight(0.1f))

        }
    }
}