package com.example.whatsappclone.data

data class TabData (
    val title: String,
    val unreadCount: Int?
)

val tabs = listOf(
    TabData(title = TabType.CHATS.value, unreadCount = 2),
    TabData(title = TabType.STATUS.value, unreadCount = 0),
    TabData(title = TabType.CALLS.value, unreadCount = null)
)

enum class TabType(val value: String) {
    CHATS("Chats"),
    STATUS("Status"),
    CALLS("Calls")
}

const val INITIAL_SCREEN = 0
