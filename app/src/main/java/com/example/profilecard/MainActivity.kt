package com.example.profilecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.profilecard.ui.theme.ProfileCardTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                )
                {
                    ProfileCard(
                        name = "Stephanie Quach",
                        description = "Hi! My name is Stephanie and I'm a programming student at Pellissippi College.",
                        imageResource = R.drawable.profilepicture
                    )
                }
            }
        }
    }
}

//profile card layout
@Composable
fun ProfileCard(
    name: String,
    description: String,
    imageResource: Int
) {
    //column to stack components vertically
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFA8A7F7))
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp, alignment = Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ProfileImage(imageResource = imageResource)
        Text(
            text = name,
            fontSize = 40.sp
        )
        Text(
            text = description,
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        )
    }
}

//display profile image as a circle
@Composable
fun ProfileImage(imageResource: Int, modifier: Modifier = Modifier) {
    val image = painterResource(id = imageResource)
    Image(
        painter = image,
        contentDescription = "Profile Picture",
        modifier = modifier
            .clip(CircleShape)
            .size(300.dp)
    )
}

//preview for testing UI
@Preview(showBackground = true)
@Composable
fun ProfileCardPreview() {
    ProfileCardTheme {
            ProfileCard(
                name = "Stephanie Quach",
                description = "Hi! My name is Stephanie and I'm a programming student at Pellissippi College.",
                imageResource = R.drawable.profilepicture
            )
    }
}