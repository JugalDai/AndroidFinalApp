package com.jugalshrestha.onlinebazaar.response

import com.jugalshrestha.onlinebazaar.entity.User

data class AddUserResponse(
    val success: Boolean?=null,
    val data : User?= null
)
