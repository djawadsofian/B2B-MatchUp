package com.example.b2bmatchup.ui.screens

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.b2bmatchup.B2BMatchUpScreen
import com.example.b2bmatchup.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen() {
    Scaffold(
        topBar = {
            AppBar(B2BMatchUpScreen.SignUp.title)
        }
    ) {innerPadding ->

        
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar (@StringRes title: Int) {
    TopAppBar(
        title = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                }


                Text(text = stringResource(id = title))
                Image(
                    painter = painterResource(id = R.drawable.group_removebg_preview),
                    contentDescription = null
                )
            }
        }
    )
}










