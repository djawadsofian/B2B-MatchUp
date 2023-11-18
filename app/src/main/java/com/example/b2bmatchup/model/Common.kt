package com.example.b2bmatchup.model

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.example.b2bmatchup.ui.theme.Shapes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RequiredSection(
    requiredField: Int,
    icon: ImageVector,
    label: Int,
    modifier: Modifier = Modifier
){
    var text by rememberSaveable {
        mutableStateOf("")
    }
    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text(text = stringResource(id = requiredField)) },
        placeholder = { Text(text = stringResource(id = label)) },
        leadingIcon = { Icon(imageVector = icon , contentDescription = null) },
        shape = Shapes.small,
        modifier = modifier
            .fillMaxWidth()
            .padding(20.dp)
            .height(63.dp)
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordSection(
    requiredField: Int,
    icon: ImageVector,
    label: Int,
    modifier: Modifier = Modifier
){
    var password by rememberSaveable {
        mutableStateOf("")
    }
    TextField(
        value = password,
        onValueChange = {
                        },
        label = { Text(text = stringResource(id = requiredField)) },
        placeholder = { Text(text = stringResource(id = label)) },
        leadingIcon = { Icon(imageVector = icon , contentDescription = null) },
        visualTransformation =  PasswordVisualTransformation(),
        shape = Shapes.small,
        modifier = modifier
            .fillMaxWidth()
            .padding(20.dp)
            .height(63.dp)
    )

}

