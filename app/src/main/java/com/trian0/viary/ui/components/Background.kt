package com.trian0.viary.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.TileMode
import com.trian0.viary.ui.theme.ViaryPrimaryContainer
import com.trian0.viary.ui.theme.ViarySecondaryContainer

@Composable
fun Background(content: @Composable () -> Unit) {
    val diagonalBrush = Brush.linearGradient(
        colors = listOf(
            ViaryPrimaryContainer,
            ViarySecondaryContainer
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
            modifier = Modifier.matchParentSize()
        )

        content()
    }
}