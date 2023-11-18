package com.example.b2bmatchup.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.b2bmatchup.R
import com.example.b2bmatchup.model.PasswordSection
import com.example.b2bmatchup.model.RequiredSection

@Composable
fun LogInScreen(
    modifier: Modifier = Modifier
){
    val primaryColor = MaterialTheme.colorScheme.primary
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Spacer(modifier = modifier.height(170.dp))
        Text(
            text = stringResource(id = R.string.enter_information),
            fontSize = 32.sp,
            color = primaryColor
            )
        Spacer(modifier = modifier.height(50.dp))
        RequiredSection(
            requiredField = R.string.email,
            icon = Icons.Default.Email,
            label = R.string.email_label
        )
        Spacer(modifier = modifier.height(35.dp))
        PasswordSection(
            requiredField = R.string.password,
            icon = Icons.Default.Lock,
            label = R.string.password_label
        )
        Spacer(modifier = modifier.height(180.dp))
        Button(
            onClick = {  },
            modifier = Modifier
                .fillMaxWidth(1f)
                .height(65.dp)
                .padding(start = 15.dp, end = 15.dp)


        ) {
            Text(text = stringResource(id = R.string.login), fontSize = 30.sp)
        }
    }
}
