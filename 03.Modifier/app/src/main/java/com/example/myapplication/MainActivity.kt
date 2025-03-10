package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.ModifierTheme

val myModifier1 = Modifier
    .background(color = Color.Gray)
    .border(10.dp, color = Color.Magenta)
    .padding(10.dp)

val myModifier2 = Modifier
    .wrapContentSize()
    .background(color = Color(0xffffc896))
    .border(10.dp, color = Color.White)
    .padding(10.dp)

val myModifier3 = Modifier
    .background(color = Color(0xffffc896))
    .border(10.dp, color = Color.White)
    .padding(10.dp)
    .wrapContentSize()

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ModifierTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    Greeting("Android", myModifier1)
                }
                Surface(
                    modifier = Modifier.fillMaxSize(0.5f),
                    color = Color.Red
                ) {
                    Greeting("Android", myModifier2)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifierParam: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        fontSize = 32.sp,
        color = Color.Blue,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = modifierParam
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ModifierTheme {
        Greeting("Android", myModifier1)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    ModifierTheme {
        Greeting("Android", myModifier2)
    }
}