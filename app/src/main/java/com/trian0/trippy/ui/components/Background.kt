package com.trian0.trippy.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import com.trian0.trippy.ui.theme.BackgroundBlue
import com.trian0.trippy.ui.theme.Blue40

@Composable
fun Background(content: @Composable () -> Unit) {
    val diagonalBrush = Brush.linearGradient(
        colors = listOf(
            BackgroundBlue,
            Blue40
        ),
        start = Offset(0f, 0f),
        end = Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY),
        tileMode = TileMode.Clamp
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(diagonalBrush)
    ) {
        Box(
            modifier = Modifier
                .matchParentSize()
                .background(Color.White.copy(alpha = 0.02f))
        )

        content()
    }
}