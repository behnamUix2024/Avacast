package com.behnamuix.avacast.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.behnamuix.avacast.R
import com.behnamuix.avacast.ui.theme.primary_500

@Composable
fun WelcomeScreen(next: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Image(
            modifier = Modifier
                .size(550.dp),
            painter = painterResource(R.drawable.img_welcom_screen),
            contentDescription = ""
        )
        Spacer(modifier = Modifier.height(50.dp))
        Text(
            text = buildAnnotatedString {
                append("با ")
                withStyle(
                    style = SpanStyle(
                        color = primary_500 // یا Color(0xFF...)
                    )
                ) {
                    append("آواکست")
                }
                append(" در لحظه به دریایی از پادکست ها دسترسی دارین!")
            },
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineMedium,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(50.dp))

        Button(
            colors = ButtonDefaults.buttonColors(containerColor = primary_500),
            onClick = {
                next()
            }
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(10.dp),
                color = White,
                textAlign = TextAlign.Center,
                text = "بعدی",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold
            )
        }


    }

}