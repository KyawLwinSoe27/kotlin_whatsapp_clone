package com.example.whatsappclone.presentation.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit

@Composable
fun TextComponent(text: String, fontSize: TextUnit, color: Color, modifier: Modifier?) {
 if (modifier != null) {
  Text(
   modifier = modifier,
   text = text, style = TextStyle(fontSize = fontSize, color = color))
 } else {
    Text(
     text = text, style = TextStyle(fontSize = fontSize, color = color))
 }
}