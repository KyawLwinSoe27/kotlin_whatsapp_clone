package com.example.whatsappclone.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ActiveNowIndicator(isActive: Boolean, activeColor: Color = Color.Green, inactiveColor: Color = Color.Gray) {
    Box(
        modifier = Modifier
            .size(12.dp)
            .background(
                color = if (isActive) activeColor else inactiveColor,
                shape = CircleShape
            )
    )
}