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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.profilecard.ui.theme.ProfileCardTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun ProfileCard(
    name: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {

    Column (
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFA8A7F7))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        ProfileImage()
        Text(
            text = name,
            fontSize = 40.sp,
            lineHeight = 50.sp,
            modifier = modifier
                .padding(8.dp)
        )
        Text(
            text = description,
            fontSize = 20.sp,
            lineHeight = 30.sp,
            modifier = modifier
                .padding(8.dp)
        )
    }
}

@Composable
fun ProfileImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.profilepicture)
    Image(
        painter = image,
        contentDescription = "Profile Picture",
        modifier = modifier
            .clip(CircleShape)
            .padding(8.dp)


    )


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProfileCardTheme {
        ProfileCard(
            name = "Stephanie Quach",
            description = "Hi! my name is Stephanie and I'm a programmer.",
            backgroundColor = Color(0xFFF6EDFF))
    }
}