package com.jugalshrestha.onlinebazaar.response

import com.jugalshrestha.onlinebazaar.entity.Cart

data class CartResponse (
    val success: Boolean? = null,
    val data: MutableList<Cart>? = null
)