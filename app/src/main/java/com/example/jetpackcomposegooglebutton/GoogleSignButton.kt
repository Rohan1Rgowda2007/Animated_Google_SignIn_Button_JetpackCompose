package com.example.jetpackcomposegooglebutton


import android.widget.Toast
import androidx.activity.compose.LocalActivityResultRegistryOwner
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.interpolator.view.animation.FastOutSlowInInterpolator
import com.example.jetpackcomposegooglebutton.ui.theme.Purple200
import com.example.jetpackcomposegooglebutton.ui.theme.Purple700

@Composable
fun SignInButton() {

    var onClickState by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = White)
    ) {
        OutlinedButton(
            onClick = {
                onClickState = !onClickState
            },
            modifier = Modifier
                .padding(30.dp)){
            Row(
                modifier = Modifier
                    .height(34.dp) // hello world so there are not ab
                    .padding(end = 2.dp)
                    .animateContentSize(
                        animationSpec = tween(
                            durationMillis = 300,
                            easing = FastOutLinearInEasing
                        )
                    ),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,

                ) {

                Icon(
                    painter = painterResource(id = R.drawable.google_image),
                    contentDescription = "Google Button",
                    tint = Color.Unspecified,
                    modifier = Modifier
                        .padding(start = 2.dp)
                )

                Text(
                    text = "Sigh in with Google",
                    fontStyle = MaterialTheme.typography.h1.fontStyle,
                    color = Black
                )

                if (onClickState) {
                    CircularProgressIndicator(
                        strokeWidth = 1.dp,
                        modifier = Modifier
                            .size(34.dp)
                            .padding(start = 14.dp, top = 10.dp)
                    )
                }
            }

        }
        }
    }



@Preview
@Composable
fun DefaultPreviews() {
    SignInButton()
}