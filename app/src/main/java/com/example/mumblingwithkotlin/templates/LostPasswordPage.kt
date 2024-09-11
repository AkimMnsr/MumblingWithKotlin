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
fun LostPasswordPage(){
    BasicComponent{
        Column(modifier = Modifier
            .padding(40.dp)
            .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally){
            Spacer(modifier = Modifier.weight(0.1f))
            TextTitleComponent("Get your password")
            Spacer(modifier = Modifier.weight(0.1f))
            TextFieldComponent("Email")
            Spacer(modifier = Modifier.padding(vertical = 5.dp))
            ButtonComponent("Send link to reset password", {})
            Spacer(modifier = Modifier.weight(0.2f))
        }
    }
}