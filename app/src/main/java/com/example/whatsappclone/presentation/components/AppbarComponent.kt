package com.example.whatsappclone.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsappclone.R
import com.example.whatsappclone.ui.theme.WhatsAppCloneTheme


@Composable
fun AppbarComponent() {
//   TopAppBar(
//       title = {
//
//   })
    Row(
        modifier = Modifier
            .height(56.dp)
            .background(color = MaterialTheme.colorScheme.primary),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "WhatsApp",
            style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
            color = MaterialTheme.colorScheme.onPrimary,
        )

        Spacer(modifier = Modifier.weight(1f))

        IconComponent(iconId = R.drawable.baseline_search_24)
        Spacer(modifier = Modifier.size(20.dp))
        IconComponent(iconId = R.drawable.baseline_camera_alt_24)
        Spacer(modifier = Modifier.size(20.dp))
        IconComponent(iconId = R.drawable.baseline_menu_24)
    }
}

@Composable
fun IconComponent(iconId: Int) {
    Icon(painter = painterResource(id = iconId), contentDescription = "", tint = MaterialTheme.colorScheme.onPrimary)

}

@Preview
@Composable
fun AppbarComponentPreview() {
    WhatsAppCloneTheme {
        AppbarComponent()
    }
}