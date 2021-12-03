package com.jugalshrestha.onlinebazaar.repository

import com.jugalshrestha.onlinebazaar.api.MyApiRequest
import com.jugalshrestha.onlinebazaar.api.ServiceBuilder
import com.jugalshrestha.onlinebazaar.api.SingleProductAPI
import com.jugalshrestha.onlinebazaar.response.ProductResponse

class SingleProductRepository: MyApiRequest() {
    private val singleProductAPI = ServiceBuilder.buildService(SingleProductAPI::class.java)

    //Display Single Product
    suspend fun getSingleProduct(id:String):ProductResponse{
        return apiRequest {
            singleProductAPI.showSingleProduct(id)
        }
    }
}