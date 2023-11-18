package com.example.b2bmatchup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.b2bmatchup.ui.screens.FirstScreen
import com.example.b2bmatchup.ui.screens.GetStartedScreen
import com.example.b2bmatchup.ui.screens.LogInScreen
import com.example.b2bmatchup.ui.theme.B2BMatchUpTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            B2BMatchUpTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //GetStartedScreen( onNextClicked = {  } )
                    //FirstScreen({}, {}, {})
                    //LogInScreen()
                    B2BMatchUpApp()
                }
            }
        }
    }
}



