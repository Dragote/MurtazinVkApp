package com.gmail.intellect.logos.vkapp.fragment.profileView.feed

class PostMessage(
    id: Int,
    val profileName : String,
    val message: String,
    val image: String,
    val video: String,
    val musicSongName: String,
    val musicAuthor : String,
    val likes: Int,
    val date: String


) : BaseMessage(id)