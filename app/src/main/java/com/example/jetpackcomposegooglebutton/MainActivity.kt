package com.example.jetpackcomposegooglebutton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposegooglebutton.ui.theme.JetPackComposeGoogleButtonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface() {
                Column(
                    modifier = Modifier
                        .padding(top = 350.dp,start = 90.dp),

                    ) {
                    SignInButton()
                }
            }
        }
    }
    // Hello World  my name is Rohan so ther are not abl
    // to make in this word so ther are not android phone
    // so ther are a mouse
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Surface() {
        Column(
            modifier = Modifier
                .padding(top = 350.dp,start = 57.dp),

        ) {
            SignInButton()
        }
    }

}