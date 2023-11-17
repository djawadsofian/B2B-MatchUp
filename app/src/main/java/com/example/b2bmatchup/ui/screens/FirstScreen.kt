package com.example.b2bmatchup.ui.screens

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.b2bmatchup.R
import com.example.b2bmatchup.ui.theme.B2BMatchUpTheme

@Composable
fun FirstScreen(
    onSearchButtonClicked: () -> Unit,
    onLogInNextButtonClicked: () -> Unit,
    onSignUpButtonClicked: () -> Unit,
    modifier:Modifier=Modifier
){

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(top = 120.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier.size(200.dp,200.dp)
        )
        Spacer(modifier = modifier.height(20.dp))
        Text(
            text = stringResource(R.string.slogan),
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = modifier.height(130.dp))
        Button(
            onClick = { onSearchButtonClicked },
            modifier= Modifier
                .fillMaxWidth(1f)
                .height(65.dp)
                .padding(start = 15.dp, end = 15.dp)


        ){
            Text(text = stringResource(id = R.string.search), fontSize = 30.sp)
        }
        Spacer(modifier = modifier.height(30.dp))
        Button(
            onClick = { onLogInNextButtonClicked },
            modifier = Modifier
                .fillMaxWidth(1f)
                .height(65.dp)
                .padding(start = 15.dp, end = 15.dp)
        )
        {
            Text(text = stringResource(id = R.string.login), fontSize = 30.sp)
        }
        TextButton(onClick = { onSignUpButtonClicked }) {
            Text(text = stringResource(id = R.string.signup))
        }
    }

}

@Preview(showBackground =true)
@Composable
fun  FirstScreenPreview() {
    B2BMatchUpTheme {
        FirstScreen({}, {}, {})
    }
}

