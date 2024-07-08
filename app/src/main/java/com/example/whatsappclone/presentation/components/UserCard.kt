package com.example.whatsappclone.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappclone.R
import com.example.whatsappclone.data.Message
import com.example.whatsappclone.data.MessageDeliveryStatus
import com.example.whatsappclone.data.MessageType
import com.example.whatsappclone.data.User

@Composable
fun UserCard(chatData: User) {
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .padding(start = 16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        MessageHeader(chatData)
        Spacer(modifier = Modifier.padding(10.dp))
        MessageSubSection(chatData)
    }
}

@Composable
fun MessageHeader(chatData: User) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    )
    {
        TextComponent(
            modifier = Modifier.weight(1f),
            text = chatData.name,
            fontSize = 14.sp,
            color = MaterialTheme.colorScheme.primary
        )
        TextComponent(
            modifier = null,
            text = chatData.message.timeStamp,
            fontSize = 12.sp,
            color = MaterialTheme.colorScheme.secondary,
        )

    }
}

@Composable
fun MessageSubSection(chatData: User) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    )
    {
        TextComponent(
            modifier = Modifier.weight(1f),
            text = chatData.message.content,
            fontSize = 14.sp,
            color = MaterialTheme.colorScheme.primary
        )
        ActiveNowIndicator(isActive = chatData.isOnline)

    }
}

@Preview(showBackground = true)
@Composable
fun UserCardPreview() {
    UserCard(
        chatData = User(
            name = "Jane Smith",
            imageUrl = R.drawable.img_1,
            message = Message(
                content = "How are you?",
                messageStatus = MessageDeliveryStatus.READ,
                type = MessageType.TEXT,
                timeStamp = "28/02/2023"
            ),
            isOnline = false
        ),
    )
}

@Preview(showBackground = true)
@Composable
fun MessageHeaderPreview() {
    MessageHeader(
        chatData = User(
            name = "Jane Smith",
            imageUrl = R.drawable.img_1,
            message = Message(
                content = "How are you?",
                messageStatus = MessageDeliveryStatus.READ,
                type = MessageType.TEXT,
                timeStamp = "28/02/2023"
            ),
            isOnline = false
        ),
    )
}

@Preview(showBackground = true)
@Composable
fun MessageSubSectionPreview() {
    MessageSubSection(
        chatData = User(
            name = "Jane Smith",
            imageUrl = R.drawable.img_1,
            message = Message(
                content = "How are you?",
                messageStatus = MessageDeliveryStatus.READ,
                type = MessageType.TEXT,
                timeStamp = "28/02/2023"
            ),
            isOnline = false
        ),
    )
}