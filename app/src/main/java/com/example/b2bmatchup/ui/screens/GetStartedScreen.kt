package com.example.b2bmatchup.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.b2bmatchup.R

@Composable
fun getStartedScreen(
    onNextClicked: () -> Unit
){
    Column {
        Image(
            painter = painterResource(id = R.drawable.group),
            contentDescription = null
        )
        Text(
            text = stringResource(R.string.slogan)
        )
        Text(
            text = stringResource(R.string.Company_name)
        )
        Button(onClick = onNextClicked) {

        }
    }
}