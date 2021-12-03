package com.jugalshrestha.onlinebazaar.repository

import com.jugalshrestha.onlinebazaar.api.CartAPI
import com.jugalshrestha.onlinebazaar.api.MyApiRequest
import com.jugalshrestha.onlinebazaar.api.ServiceBuilder
import com.jugalshrestha.onlinebazaar.response.CartResponse

class CartRepository (): MyApiRequest() {
    private val cartAPI= ServiceBuilder.buildService(CartAPI::class.java)

    //Insert Product To cart
    suspend fun addTocart(productId:String,token:String): CartResponse {
        return apiRequest {
            cartAPI.insertCart(token!!,productId)
        }
    }

    //Retrieve cart
    suspend fun getCart(token: String): CartResponse {
        return apiRequest {
            cartAPI.retrieveCart(token!!)
        }
    }

//    ///UpdateCart
//    suspend fun updateCart(token:String,id: String,quantity:Int):CartResponse{
//        return apiRequest {
//            cartAPI.updateCart(token!!,id,quantity)
//        }
//    }

    ///DeleteCart
    suspend fun deleteCart(id: String,token:String):CartResponse{
        return apiRequest {
            cartAPI.deleteCart(token!!,id)
        }
    }



}