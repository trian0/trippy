package com.trian0.trippy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.trian0.trippy.ui.navigation.AppNavigation
import com.trian0.trippy.ui.theme.TrippyTheme

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()

        splashScreen.setKeepOnScreenCondition {
            viewModel.keepSplashOn.value
        }

        super.onCreate(savedInstanceState)

        setContent {
            TrippyTheme {
                AppNavigation(viewModel = viewModel)
            }
        }
    }
}