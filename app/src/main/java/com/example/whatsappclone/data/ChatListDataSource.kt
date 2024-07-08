package com.example.whatsappclone.data

import com.example.whatsappclone.R

val chatList = listOf(
    User(
        name = "John Doe",
        imageUrl = R.drawable.img,
        message = Message(
            content = "Hello there!",
            messageStatus = MessageDeliveryStatus.SENT,
            type = MessageType.TEXT,
            timeStamp = "27/02/2023"
        ),
        isOnline = true
    ),
    User(
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
    User(
        name = "Mike Johnson",
        imageUrl = R.drawable.img_2,
        message = Message(
            content = "See you soon!",
            messageStatus = MessageDeliveryStatus.DELIVERED,
            type = MessageType.TEXT,
            timeStamp = "01/03/2023"
        ),
        isOnline = true
    ),
    User(
        name = "Emily Davis",
        imageUrl = R.drawable.img_3,
        message = Message(
            content = "What's up?",
            messageStatus = MessageDeliveryStatus.FAILED,
            type = MessageType.TEXT,
            timeStamp = "02/03/2023"
        ),
        isOnline = false
    ),
    User(
        name = "Chris Brown",
        imageUrl = R.drawable.img_4,
        message = Message(
            content = "Good morning!",
            messageStatus = MessageDeliveryStatus.SENT,
            type = MessageType.TEXT,
            timeStamp = "03/03/2023"
        ),
        isOnline = true
    ),
    User(
        name = "Patricia Wilson",
        imageUrl = R.drawable.img_5,
        message = Message(
            content = "Let's meet up.",
            messageStatus = MessageDeliveryStatus.READ,
            type = MessageType.TEXT,
            timeStamp = "04/03/2023"
        ),
        isOnline = true
    ),
    User(
        name = "Robert Miller",
        imageUrl = R.drawable.img_6,
        message = Message(
            content = "Thanks!",
            messageStatus = MessageDeliveryStatus.DELIVERED,
            type = MessageType.TEXT,
            timeStamp = "05/03/2023"
        ),
        isOnline = false
    ),
    User(
        name = "Linda Taylor",
        imageUrl = R.drawable.img_7,
        message = Message(
            content = "Happy Birthday!",
            messageStatus = MessageDeliveryStatus.FAILED,
            type = MessageType.TEXT,
            timeStamp = "06/03/2023"
        ),
        isOnline = true
    ),
    User(
        name = "David Anderson",
        imageUrl = R.drawable.img_8,
        message = Message(
            content = "See you tomorrow.",
            messageStatus = MessageDeliveryStatus.SENT,
            type = MessageType.TEXT,
            timeStamp = "07/03/2023"
        ),
        isOnline = false
    ),
    User(
        name = "Barbara Moore",
        imageUrl = R.drawable.img_9,
        message = Message(
            content = "I'll call you later.",
            messageStatus = MessageDeliveryStatus.READ,
            type = MessageType.TEXT,
            timeStamp = "08/03/2023"
        ),
        isOnline = true
    ),
    User(
        name = "James Thompson",
        imageUrl = R.drawable.img_10,
        message = Message(
            content = "Good night.",
            messageStatus = MessageDeliveryStatus.DELIVERED,
            type = MessageType.TEXT,
            timeStamp = "09/03/2023"
        ),
        isOnline = false
    ),
    User(
        name = "Mary Garcia",
        imageUrl = R.drawable.img,
        message = Message(
            content = "Can you help me?",
            messageStatus = MessageDeliveryStatus.FAILED,
            type = MessageType.TEXT,
            timeStamp = "10/03/2023"
        ),
        isOnline = true
    ),
    User(
        name = "William Martinez",
        imageUrl = R.drawable.img_1,
        message = Message(
            content = "Thank you!",
            messageStatus = MessageDeliveryStatus.SENT,
            type = MessageType.TEXT,
            timeStamp = "11/03/2023"
        ),
        isOnline = true
    ),
    User(
        name = "Elizabeth Hernandez",
        imageUrl = R.drawable.img_2,
        message = Message(
            content = "No problem.",
            messageStatus = MessageDeliveryStatus.READ,
            type = MessageType.TEXT,
            timeStamp = "12/03/2023"
        ),
        isOnline = false
    ),
    User(
        name = "Richard Clark",
        imageUrl = R.drawable.img_3,
        message = Message(
            content = "I'll be there at 5.",
            messageStatus = MessageDeliveryStatus.DELIVERED,
            type = MessageType.TEXT,
            timeStamp = "13/03/2023"
        ),
        isOnline = true
    ),
    User(
        name = "Susan Lewis",
        imageUrl = R.drawable.img_4,
        message = Message(
            content = "Good luck!",
            messageStatus = MessageDeliveryStatus.FAILED,
            type = MessageType.TEXT,
            timeStamp = "14/03/2023"
        ),
        isOnline = false
    ),
    User(
        name = "Charles Lee",
        imageUrl = R.drawable.img_5,
        message = Message(
            content = "Let's do this.",
            messageStatus = MessageDeliveryStatus.SENT,
            type = MessageType.TEXT,
            timeStamp = "15/03/2023"
        ),
        isOnline = true
    ),
    User(
        name = "Karen Walker",
        imageUrl = R.drawable.img_6,
        message = Message(
            content = "How was your day?",
            messageStatus = MessageDeliveryStatus.READ,
            type = MessageType.TEXT,
            timeStamp = "16/03/2023"
        ),
        isOnline = false
    ),
    User(
        name = "Joseph Hall",
        imageUrl = R.drawable.img_7,
        message = Message(
            content = "Happy New Year!",
            messageStatus = MessageDeliveryStatus.DELIVERED,
            type = MessageType.TEXT,
            timeStamp = "17/03/2023"
        ),
        isOnline = true
    ),
    User(
        name = "Sarah Allen",
        imageUrl = R.drawable.img_8,
        message = Message(
            content = "Where are you?",
            messageStatus = MessageDeliveryStatus.FAILED,
            type = MessageType.TEXT,
            timeStamp = "18/03/2023"
        ),
        isOnline = false
    )
)