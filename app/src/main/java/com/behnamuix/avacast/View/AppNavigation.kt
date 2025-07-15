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
import com.behnamuix.avacast.View.ProfileScreen
import com.behnamuix.avacast.View.SelectSignIn
import com.behnamuix.avacast.View.SplashScreenLoading
import com.behnamuix.avacast.View.WelcomeScreen
import com.behnamuix.avacast.ui.theme.AvacastTheme
import com.behnamuix.avacast.ui.theme.black
import com.behnamuix.avacast.ui.theme.indigo
import com.behnamuix.avacast.ui.theme.pink
import com.behnamuix.avacast.ui.theme.primary_500
import com.behnamuix.avacast.ui.theme.success

// 1. مسیرهای هر صفحه رو به صورت ثابت‌های String تعریف کن (بهتره)
object AppScreens {
    const val SPLASH_SCREEN_LOADING = "splash_screen_loading"
    const val WELCOME_SCREEN = "WelcomeSc"
    const val SELECT_SIGNIN = "SelectSignInSc"
    const val PROFILE_SCREEN = "ProfileSc"
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(

        navController = navController,
        startDestination = AppScreens.PROFILE_SCREEN
    ) {

        // صفحه اسپلش
        composable(AppScreens.SPLASH_SCREEN_LOADING) {
            SplashScreenLoading(
                onLoginSuccess = {
                    navController.navigate(AppScreens.WELCOME_SCREEN) {
                        popUpTo(AppScreens.SPLASH_SCREEN_LOADING) { inclusive = true }
                    }
                }
            )
        }

        // صفحه خوش آمدگویی
        composable(AppScreens.WELCOME_SCREEN) {
            WelcomeScreen(
                next = {
                    // به صفحه بعدی بروید (مثلا SIGNUP_SCREEN)
                    navController.navigate(AppScreens.SELECT_SIGNIN)
                }
            )
        }

        // صفحه ثبت نام (مثال)
        composable(AppScreens.SELECT_SIGNIN) {
            SelectSignIn(
                next = { navController.popBackStack() },
                back = {navController.navigate(AppScreens.WELCOME_SCREEN)})
        }
//
        // صفحه ورود (مثال)
        composable(AppScreens.PROFILE_SCREEN) {
            ProfileScreen (
                countinue = { navController.navigate(AppScreens.SPLASH_SCREEN_LOADING) },
                back = { navController.navigate(AppScreens.SELECT_SIGNIN) }
            )
        }
    }
}





