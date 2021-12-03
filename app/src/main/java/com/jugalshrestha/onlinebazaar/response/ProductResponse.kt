package com.jugalshrestha.onlinebazaar.response


import com.jugalshrestha.onlinebazaar.entity.Product

data class ProductResponse(
        val success : Boolean? = null,
        val data: MutableList<Product>? = null
)
