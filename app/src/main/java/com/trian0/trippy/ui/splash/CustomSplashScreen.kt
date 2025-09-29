package com.trian0.trippy.ui.splash

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.trian0.trippy.MainViewModel
import com.trian0.trippy.R
import com.trian0.trippy.SplashNavState
import kotlinx.coroutines.delay

@Composable
fun CustomSplashScreen(
    onNavigateToAuth: () -> Unit,
    onNavigateToHome: () -> Unit,
    viewModel: MainViewModel = viewModel()
) {
    val navState by viewModel.navState.collectAsStateWithLifecycle()
    val VISIBLE_TIME_AFTER_LOAD = 3000L

    LaunchedEffect(navState) {
        when (navState) {
            is SplashNavState.ReadyToNavigate -> {

                delay(VISIBLE_TIME_AFTER_LOAD)
                val isLoggedIn = false
                viewModel.startFinalNavigation(isLoggedIn)

            }

            is SplashNavState.NavigateToAuth -> {
                onNavigateToAuth()
            }

            is SplashNavState.NavigateToHome -> {
                onNavigateToHome()
            }

            SplashNavState.Loading -> {}
        }
    }

    val infiniteTransition = rememberInfiniteTransition(label = "pulsatingLogo")
    val scale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 1.05f,
        animationSpec = infiniteRepeatable(
            animation = tween(1000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ), label = "scale"
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
    ) {
        Image(
            painter = painterResource(id = R.drawable.splash),
            contentDescription = "Trippy Logo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .scale(scale)
        )
    }
}