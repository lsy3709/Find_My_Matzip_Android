package com.example.find_my_matzip.model

import java.security.Timestamp

data class TempChatRoom(
    val id: String? =null,
    // 채팅방에 참가한 유저들 1:1방 일시 두명의 유저ID만 있음
    val users: MutableList<String>? =null,
    // 마지막 chat가 올라온 시간
    val lastChat: Timestamp? =null,
    // onStop 때마다 TimeStamp 값 갱신
    val userLastVisited: Map<String, Timestamp>? = null
    // 나의 index에 해당하는 userLastVisited가 lastChatTimeStamp보다 작으면 '읽지 않음' 표시
)