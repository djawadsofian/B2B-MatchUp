package com.example.b2bmatchup.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
        modifier = modifier.padding(top = 120.dp)
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
            text = stringResource(R.string.Company_name),
            fontSize = 34.sp
        )
        Spacer(modifier = modifier.height(100.dp))
        Row {
            Spacer(modifier = modifier.width(200.dp))
            Button(
                onClick = onNextClicked,
                modifier = modifier
                    .fillMaxWidth()
                    .height(65.dp)
                    .padding(end = 80.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowForward ,
                    contentDescription = null,
                    modifier = modifier.size(30.dp,30.dp),
                    tint = Color(android.graphics.Color.WHITE)
                )
            }
        }
    }
}