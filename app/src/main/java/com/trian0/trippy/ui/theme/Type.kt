package com.trian0.trippy.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.trian0.trippy.R

val Cabin = FontFamily(
    Font(R.font.cabin, FontWeight.Normal),
    Font(R.font.cabin_bold, FontWeight.Bold),
    Font(R.font.cabin_semibold, FontWeight.SemiBold),
    Font(R.font.cabin_medium, FontWeight.Medium),
    )

val Typography = Typography(
    headlineLarge = androidx.compose.ui.text.TextStyle(
        fontFamily = Cabin,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.sp
    ),

    bodyMedium = androidx.compose.ui.text.TextStyle(
        fontFamily = Cabin,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),

    labelLarge = androidx.compose.ui.text.TextStyle(
        fontFamily = Cabin,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    )
)
