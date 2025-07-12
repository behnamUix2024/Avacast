package com.behnamuix.avacast.View

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.behnamuix.avacast.R
import com.behnamuix.avacast.ui.theme.black
import com.behnamuix.avacast.ui.theme.primary_500

@Composable
fun SplashScreenLoading(onLoginSuccess: () -> Unit) {
    Column(

    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Row (){
                Icon(
                    tint = primary_500,
                    modifier = Modifier
                        .size(60.dp),
                    painter = painterResource(R.drawable.discount),
                    contentDescription = ""
                )
                Text(
                    text="2آواکست",
                    style = MaterialTheme.typography.displayMedium,
                    color = black
                )

            }
        }

    }
}