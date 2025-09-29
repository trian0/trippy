package com.trian0.trippy.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.trian0.trippy.MainViewModel
import com.trian0.trippy.ui.home.HomeScreen
import com.trian0.trippy.ui.login.LoginScreen
import com.trian0.trippy.ui.splash.CustomSplashScreen

@Composable
fun AppNavigation(viewModel: MainViewModel = viewModel()) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "splash_route") {

        composable("splash_route") {
            CustomSplashScreen(
                viewModel = viewModel,
                onNavigateToAuth = {
                    navController.navigate("auth_route") {
                        popUpTo("splash_route") { inclusive = true }
                    }
                },
                onNavigateToHome = {
                    navController.navigate("home_route") {
                        popUpTo("splash_route") { inclusive = true }
                    }
                }
            )
        }

        // --- 2. Outras Rotas ---
        composable("auth_route") { LoginScreen() }
        composable("home_route") { HomeScreen() }
        // ...
    }
}