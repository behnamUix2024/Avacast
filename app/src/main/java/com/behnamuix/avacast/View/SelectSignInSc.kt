package com.behnamuix.avacast.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.behnamuix.avacast.R
import com.behnamuix.avacast.ui.theme.VazirFont
import com.behnamuix.avacast.ui.theme.VazirFontBold
import com.behnamuix.avacast.ui.theme.grayscale_600
import com.behnamuix.avacast.ui.theme.primary_500

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SelectSignIn(next: () -> Unit, back: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(White)
    ) {
        TopAppBar(
            modifier = Modifier
                .padding(start = 12.dp, end = 12.dp),
            title = {},
            actions = {

            },
            navigationIcon = {
                IconButton({ back() }) {
                    Icon(
                        painter = painterResource(R.drawable.icon_arrow_back),
                        contentDescription = "",
                        modifier = Modifier
                            .size(32.dp)
                    )
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Transparent
            )
        )

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.img_login_let_you_in),
                contentDescription = ""
            )
            Spacer(Modifier.height(18.dp))


            Text(
                text = "وارد شوید با:",
                style = MaterialTheme.typography.displayLarge
            )
            Column( modifier = Modifier
                .padding(12.dp)) {
                ButtonCard("حساب فیسبوک", R.drawable.icon_facebook)
                Spacer(modifier = Modifier.height(24.dp))
                ButtonCard("حساب گوگل", R.drawable.icon_google)
                Spacer(Modifier.height(8.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                ){
                    HorizontalDivider(modifier = Modifier
                        .fillMaxWidth(0.5f))
                    Text(text="یا", fontSize = 18.sp, fontFamily = VazirFontBold)
                    HorizontalDivider(modifier = Modifier
                        .fillMaxWidth())


                }
                Spacer(Modifier.height(8.dp))

                Button(
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = primary_500),
                    onClick = {}) {
                    Text(
                        modifier = Modifier
                            .padding(vertical = 10.dp),
                        text="گذرواژه",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
                Spacer(Modifier.height(18.dp))
                Text(
                    buildAnnotatedString {
                        append("آیا شما حساب کاربری ندارید؟")
                        withStyle (
                            SpanStyle(
                                color = primary_500
                            )
                        ){
                            append("ثبت نام")
                        }
                    },
                    color = grayscale_600,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally),

                )

            }

        }

    }

}

@Composable
fun ButtonCard(title: String, icon: Int) {
    OutlinedButton (
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(24.dp),
        onClick = {}) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                color = Black,
                modifier = Modifier
                    .padding(12.dp),
                text = title,
                style = MaterialTheme.typography.bodyLarge
            )
            icon?.let {
                Icon(
                    painter = painterResource(it),
                    contentDescription = "",
                    modifier = Modifier
                        .size(24.dp)
                )
            }
        }
    }
}