package com.behnamuix.avacast.View

import android.graphics.drawable.Drawable
import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.behnamuix.avacast.R
import com.behnamuix.avacast.ui.theme.VazirFont
import com.behnamuix.avacast.ui.theme.VazirFontBold
import com.behnamuix.avacast.ui.theme.grayscale_100
import com.behnamuix.avacast.ui.theme.grayscale_50
import com.behnamuix.avacast.ui.theme.primary_100
import com.behnamuix.avacast.ui.theme.primary_200
import com.behnamuix.avacast.ui.theme.primary_500

@Composable
fun ProfileScreen(countinue: () -> Unit, back: () -> Unit) {
    val lname = remember { mutableStateOf("") }
    var fname = remember { mutableStateOf("") }
    var hbp = remember { mutableStateOf("") }
    var email = remember { mutableStateOf("") }
    var phone = remember { mutableStateOf("") }
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .padding(start = 12.dp, end = 12.dp)
            .fillMaxSize()
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp)
                .align(Alignment.Start)
        ) {

            IconButton({ back() }) {
                Icon(
                    painter = painterResource(R.drawable.icon_arrow_back),
                    contentDescription = "",
                    modifier = Modifier.size(32.dp)
                )
            }
            Text(
                text = "پروفایل", style = MaterialTheme.typography.bodyLarge
            )
        }
        Spacer(modifier = Modifier.height(18.dp))

        Box(
            contentAlignment = Alignment.Center, modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(R.drawable.img_profile),
                contentDescription = "",
                modifier = Modifier.size(140.dp)
            )
            Box(
                modifier = Modifier.size(130.dp), contentAlignment = Alignment.BottomEnd
            ) {
                Icon(
                    painter = painterResource(R.drawable.icon_edit_square),
                    contentDescription = "",
                    tint = primary_500,
                    modifier = Modifier.size(36.dp)
                )
            }

        }
        Spacer(modifier = Modifier.height(18.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MyEditText(lname, "نام و نام خانوادگی")
            MyEditText(fname, "نام")
            MyEditText(hbp, "تاریخ تولد", R.drawable.icon_calendar)
            MyEditText(email, "ایمیل", R.drawable.icon_msg)
            Row(
                verticalAlignment = Alignment.CenterVertically
            ){

                MyEditText(phone, "شماره موبایل", isNumber = true)
                Card(
                    shape = CircleShape,
                    modifier = Modifier


                ) {
                    Image(
                        modifier = Modifier
                            .size(36.dp),
                        painter = painterResource(R.drawable.iran),
                        contentDescription = ""
                    )
                }

            }
            Row(
                modifier = Modifier
                    .padding(vertical = 80.dp, horizontal = 20.dp)
                    .fillMaxWidth()
            ) {

                Button(
                    elevation = ButtonDefaults.elevatedButtonElevation(8.dp),

                    colors = ButtonDefaults.buttonColors(containerColor = primary_100),
                    modifier = Modifier
                        .padding(end = 20.dp)
                        .fillMaxWidth(0.5f),
                    onClick = {}) {
                    Text(
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier
                            .padding( 6.dp),
                        text = "رد شدن",
                        color = primary_500
                    )
                }
                Button(
                    elevation = ButtonDefaults.elevatedButtonElevation(8.dp),
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = primary_500),

                    onClick = {}) {
                    Text(
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier
                            .padding(6.dp),
                        text = "ادامه"
                    )
                }
            }
        }
    }

}

@Composable
fun MyEditText(
    value: MutableState<String>,
    lbl: String, icon: Int? = null,
    isNumber: Boolean = false
) {
    TextField(
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = if (isNumber) KeyboardType.Phone else KeyboardType.Text
        ),

        textStyle = TextStyle(
            textDirection = TextDirection.Rtl,
            fontFamily = VazirFontBold,
            fontSize = 14.sp
        ),
        modifier = Modifier.fillMaxWidth(0.9f),
        colors = TextFieldDefaults.colors(
            unfocusedIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedContainerColor = grayscale_100,
            focusedContainerColor = Color(0x0D9610FF),
            focusedLeadingIconColor = primary_500,


            ),
        singleLine = true,
        shape = RoundedCornerShape(22.dp),

        value = value.value,
        onValueChange = {
            value.value = it

        },
        placeholder = {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = lbl,
                style = MaterialTheme.typography.labelSmall
            )
        },
        leadingIcon = {
            icon?.let {
                Icon(
                    painter = painterResource(id = it),
                    contentDescription = ""
                )
            }

        }

    )
    Spacer(Modifier.height(18.dp))
}