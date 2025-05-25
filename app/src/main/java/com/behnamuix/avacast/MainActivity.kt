package com.behnamuix.avacast

import android.R
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.behnamuix.avacast.ui.theme.AvacastTheme

class MainActivity : ComponentActivity() {
    val list_color = listOf(Color.Green, Color.Blue, Color.Cyan)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(

                modifier = Modifier
                    .padding(start = 8.dp, top = 100.dp),
            ) {
                Text(

                    buildAnnotatedString {
                        withStyle(
                            SpanStyle(
                                fontSize = 30.sp

                            )
                        ) {
                            append("What is your")
                        }
                        withStyle(
                            SpanStyle(
                                brush = Brush.linearGradient(list_color),
                                fontSize = 40.sp
                            )
                        ) {
                            append(" name:")
                        }
                    }, modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                )
                OutlinedButton (
                    onClick = {},
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .padding(20.dp)
                        .width(180.dp)
                        .align(Alignment.CenterHorizontally)

                ) {
                    Text(
                        buildAnnotatedString {
                            withStyle(
                                SpanStyle(
                                    brush = Brush.radialGradient(list_color)
                                )
                            ){
                                append("O")
                            }
                            withStyle( SpanStyle(
                                brush = Brush.radialGradient(list_color)
                            )){
                                append("K")
                            }
                        }, modifier = Modifier
                            .padding(10.dp)


                    )
                }
            }

        }
    }
    @Preview(
        showBackground = true,
        name = "Test",
        widthDp =300,
        heightDp = 100
    )
    @Composable
    fun Preview(){
        Text(

            buildAnnotatedString {
                withStyle(
                    SpanStyle(
                        fontSize = 30.sp

                    )
                ) {
                    append("What is your")
                }
                withStyle(
                    SpanStyle(
                        brush = Brush.linearGradient(list_color),
                        fontSize = 40.sp
                    )
                ) {
                    append(" name:")
                }
            }
        )
    }
}


