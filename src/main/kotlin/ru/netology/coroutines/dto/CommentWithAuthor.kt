package ru.netology.coroutines.dto

data class CommentWithAuthor(
    val id: Long,
    val postId: Long,
    val author: String,
    val avatar: String,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
)
