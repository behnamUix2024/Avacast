// app/src/main/java/your/package/name/AppNavigation.kt (یک فایل جدید بساز)

package com.behnamuix.avacast // پکیج شما

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost // ایمپورت کن
import androidx.navigation.compose.composable // ایمپورت کن
import androidx.navigation.compose.rememberNavController // ایمپورت کن
import androidx.compose.material3.Button // برای مثال
import androidx.compose.material3.Text // برای مثال
import androidx.compose.foundation.layout.Column // برای مثال
import androidx.compose.foundation.layout.Arrangement // برای مثال
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier // برای مثال
import androidx.compose.ui.unit.dp // برای مثال
import androidx.compose.foundation.layout.padding // برای مثال
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment // برای مثال
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import com.behnamuix.avacast.View.SplashScreenLoading
import com.behnamuix.avacast.ui.theme.AvacastTheme
import com.behnamuix.avacast.ui.theme.black
import com.behnamuix.avacast.ui.theme.indigo
import com.behnamuix.avacast.ui.theme.pink
import com.behnamuix.avacast.ui.theme.primary_500
import com.behnamuix.avacast.ui.theme.success

// 1. مسیرهای هر صفحه رو به صورت ثابت‌های String تعریف کن (بهتره)
object AppScreens {
    const val SPLASH_SCREEN_LOADING = "splash_screen_loading"
    const val SPLASH_SCREEN= "splash_screen"
    const val SIGNUP_SCREEN = "signup_screen"
    const val LOGIN_SCREEN = "login_screen"
}

@Composable
fun AppNavigation() {
    // 2. یه NavController بساز. این "راننده" ناوبری شماست.
    val navController = rememberNavController()

    // 3. NavHost رو تعریف کن. این "قاب اصلی" نمایش صفحات شماست.
    NavHost(
        navController = navController, // راننده رو به قاب بده
        startDestination = AppScreens.SPLASH_SCREEN_LOADING // بهش بگو از کدوم صفحه شروع کنه
    ) {
        // 4. هر صفحه (کامپوزابل) رو به عنوان یک مقصد تعریف کن
        composable(AppScreens.SPLASH_SCREEN_LOADING) {
            // این محتوای UI صفحه ورود شماست
            SplashScreenLoading(
                onLoginSuccess = {
                    // وقتی ورود موفق بود، به صفحه اصلی برو
                    // popUpTo: صفحه ورود رو از پشته ناوبری حذف کن تا با دکمه Back برنگرده بهش
                    navController.navigate(AppScreens.SPLASH_SCREEN) {
                        popUpTo(AppScreens.SPLASH_SCREEN_LOADING) { inclusive = true }
                    }
                }
            )
        }
    }
}

// --- مثال‌هایی از صفحه‌های کامپوزابل شما ---






