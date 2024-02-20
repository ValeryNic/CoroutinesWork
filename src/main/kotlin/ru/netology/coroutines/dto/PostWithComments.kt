package ru.netology.coroutines.dto

data class PostWithComments(
    val id: Long,
    val author: String,
    val authorAvatar: String,
    val context: String,
    val likeByMe: Boolean,
    val likes: Int = 0,
    val commentsWithAuthor: List<CommentWithAuthor>,
)