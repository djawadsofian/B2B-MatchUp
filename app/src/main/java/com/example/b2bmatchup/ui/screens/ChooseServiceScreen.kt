package com.example.b2bmatchup.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.b2bmatchup.B2BMatchUpScreen
import com.example.b2bmatchup.model.AppBar


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChooseServiceScreen(){
    Scaffold (
        topBar = {
            AppBar(title = B2BMatchUpScreen.ChooseService.title)
        }
    ) {innerPadding ->
        Text(text = "moh", modifier = Modifier.padding(innerPadding))

    }
}

@Composable
fun ChooseServiceCard(){
    Card {
        Row {
            Card {
                Icon(painter = , contentDescription = )
            }

        }
    }
}
