package com.example.b2bmatchup.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.b2bmatchup.R

@Composable
fun GetStartedScreen(
    onNextClicked: () -> Unit,
    modifier: Modifier = Modifier
){
    Column (
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(top = 100.dp)
    ){
        Image(
            painter = painterResource(id = R.drawable.group),
            contentDescription = null,
            modifier.size(200.dp,200.dp)
        )
        Spacer(modifier = modifier.height(20.dp))
        Text(
            text = stringResource(R.string.slogan),
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = modifier.height(45.dp))
        Text(
            text = stringResource(R.string.Company_name)
        )
        Spacer(modifier = modifier.height(60.dp))
        Button(onClick = onNextClicked) {
            Image(
                painter = painterResource(id = R.drawable.chevron_right_fill0_wght400_grad0_opsz24),
                contentDescription = null
            )
        }
    }
}