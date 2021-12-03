package com.jugalshrestha.onlinebazaar.response


import com.jugalshrestha.onlinebazaar.entity.User

data class LoginResponse(
    val success :Boolean? = null,
    val token : String? = null,
    val data: User? = null
)
