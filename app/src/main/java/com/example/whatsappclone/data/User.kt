package com.example.whatsappclone.data

data class User(
    val name: String,
    val imageUrl: Int,
    val message : Message,
    val isOnline: Boolean
)


data class Message(
    val content : String,
    val messageStatus : MessageDeliveryStatus,
    val type : MessageType,
    val timeStamp: String,
    val unreadCount: Int?=null
)

enum class MessageDeliveryStatus {
    SENT, DELIVERED, READ, FAILED
}

enum class MessageType {
    TEXT, IMAGE, VIDEO, AUDIO
}