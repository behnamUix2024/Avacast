package com.behnamuix.avacast.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = VazirFontBold,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = VazirFontBold,
        fontSize = 30.sp,
        textDirection = TextDirection.Rtl
        ),
    displayLarge = TextStyle(
        fontFamily = VazirFontBold,
        fontSize = 45.sp,
        textDirection = TextDirection.Rtl
    ),
    labelSmall = TextStyle(
        fontFamily = VazirFont,
        textDirection = TextDirection.Rtl,
        fontSize = 12.sp,


        )








)