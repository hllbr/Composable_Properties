package com.example.composable_properties

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composable_properties.ui.theme.Composable_propertiesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Composable_propertiesTheme {
                // A surface container using the 'background' color from the theme
                //Surface(color = MaterialTheme.colors.background) {
                    MainScreen()
                //}
            }
        }
    }
}

@Composable
fun MainScreen() {
    Text(text = "Hello Android!",color = Color.Red
        ,fontStyle = FontStyle.Italic
        ,fontWeight = FontWeight.Bold
        ,fontSize = 22.sp
        ,overflow = TextOverflow.Visible

    )
    Text(text = "Hello World!",color = Color.Magenta
        ,fontStyle = FontStyle.Normal
        ,fontWeight = FontWeight.Black
        ,fontSize = 20.sp
        ,overflow = TextOverflow.Visible)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    //Greeting(name = "Android")
    MainScreen()
    }
//}