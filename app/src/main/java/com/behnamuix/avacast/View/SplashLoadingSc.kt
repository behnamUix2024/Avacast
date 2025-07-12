package com.behnamuix.avacast.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.behnamuix.avacast.R
import com.behnamuix.avacast.ui.theme.black
import com.behnamuix.avacast.ui.theme.dark3
import com.behnamuix.avacast.ui.theme.grayscale_700
import com.behnamuix.avacast.ui.theme.primary_500
import com.behnamuix.avacast.ui.theme.secondary_500
import kotlinx.coroutines.delay

@Composable
fun SplashScreenLoading(onLoginSuccess: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()

    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Row (){
                Image(
                    modifier = Modifier
                        .size(60.dp),
                    painter = painterResource(R.drawable.img_logo),
                    contentDescription = ""
                )
                Text(
                    text="آواکست",
                    style = MaterialTheme.typography.displayMedium,
                    fontWeight = FontWeight.Bold,
                    color = black
                )

            }
            Box(
                contentAlignment = Alignment.BottomCenter,
                modifier = Modifier
                    .padding(bottom = 100.dp)
                    .fillMaxSize()
            ){
                CircularProgressIndicator(
                    modifier = Modifier
                        .size(65.dp),
                    color = primary_500,
                    strokeCap = StrokeCap.Round,
                )
            }
            LaunchedEffect(Unit) {
                delay(4000L)
                onLoginSuccess()

            }
            

        }


    }
}

@Composable
fun DelayAction(d:Long) {

    
}