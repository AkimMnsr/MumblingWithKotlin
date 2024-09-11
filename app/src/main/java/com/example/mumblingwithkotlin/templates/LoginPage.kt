package com.example.mumblingwithkotlin.templates

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mumblingwithkotlin.component.BasicComponent
import com.example.mumblingwithkotlin.component.ButtonComponent
import com.example.mumblingwithkotlin.component.TextFieldComponent
import com.example.mumblingwithkotlin.component.TextTitleComponent

@Composable
fun LoginPage(navSubscribe: () -> Unit = {}, navLostPassword: () -> Unit = {}) {
    BasicComponent {
        Column(
            modifier = Modifier
                .padding(40.dp)
                .fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.weight(0.1f))
            TextTitleComponent("Login")
            Spacer(modifier = Modifier.weight(0.1f))
            TextFieldComponent("Email")
            TextFieldComponent("Password")
            Spacer(modifier = Modifier.padding(vertical = 5.dp))
            ButtonComponent("CONNEXION")
            Spacer(modifier = Modifier.weight(0.2f))
            Column {
                ButtonComponent("REGISTER", navSubscribe)
                ButtonComponent("FORGOT PASSWORD", navLostPassword)
            }
        }
    }
}


