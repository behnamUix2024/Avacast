package com.behnamuix.avacast.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val MyShapes = Shapes(
    small = RoundedCornerShape(4.dp),  // گوشه‌های کوچکتر
    medium = RoundedCornerShape(8.dp), // گوشه‌های متوسط برای کارت‌ها و دکمه‌ها
    large = RoundedCornerShape(16.dp)  // گوشه‌های بزرگتر برای دیالوگ‌ها و کامپوننت‌های بزرگ
)