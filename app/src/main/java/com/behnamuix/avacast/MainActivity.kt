package com.behnamuix.avacast


import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.behnamuix.avacast.ui.theme.AvacastTheme
import androidx.compose.runtime.remember as remember1

class MainActivity : ComponentActivity() {
    val list_color = listOf(Color.Red, Color.Green, Color.Cyan, Color.Black)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            setUi()

        }
    }

    @Composable
    fun setUi() {
        val colors= listOf(Color.Cyan,Color.Red,Color.Red,Color.Green)
        Column(
            modifier = Modifier
                .background(Color(0xFF424242))
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Surface(
                modifier = Modifier
                    .padding(20.dp),
                shape = RoundedCornerShape(18.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.frame_4),
                    contentDescription = "d"
                )
            }
            var count: Int by remember {
                mutableStateOf(0)
            }
            Text(
                buildAnnotatedString {
                    append("Enter your home ")
                    withStyle(
                        SpanStyle(
                            brush = Brush.linearGradient(colors)
                        )
                    ){
                        append("temp")
                    }
                },

                fontSize = 26.sp,
                color = Color.White,

            )
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                Button(
                    onClick = { count+=20 },
                    modifier = Modifier
                        .width(150.dp)
                ) {
                    Text(
                        text = "▲",
                        fontSize = 20.sp

                    )
                }
                Surface(
                    shape = RoundedCornerShape(10.dp),
                    color = Color.Black,
                    modifier = Modifier
                        .padding(20.dp)
                ) {
                    Text(
                        text = "${count}ºC",
                        fontSize = 36.sp,
                        color = Color.Cyan,
                        modifier = Modifier
                            .padding(20.dp)

                    )
                }
                Button(
                    onClick = { count-=20 },
                    modifier = Modifier
                        .width(150.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF44336))
                ) {
                    Text(
                        text = "▼",
                        fontSize = 20.sp
                    )
                }

            }
        }

    }
}




