package com.example.whatsappclone.presentation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsappclone.data.User
import com.example.whatsappclone.data.chatList
import com.example.whatsappclone.presentation.components.UserCard
import com.example.whatsappclone.presentation.components.UserImage

@Composable
fun ChatScreen() {
    // Chat screen composable
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        item {
            Spacer(modifier = Modifier.height(10.dp))
        }

       items(chatList) { chatData -> ChatItem(chatData)

       }
    }
}

@Composable
fun ChatItem(chatData : User) {
    // Chat item composable
   Row(
       modifier = Modifier
           .fillMaxWidth()
           .padding(vertical = 8.dp)
   ) {
       UserImage(userImage = chatData.imageUrl)
       UserCard(chatData = chatData)
   }
}

@Preview(showBackground = true)
@Composable
fun ChatScreenPreview() {
    ChatScreen()
}