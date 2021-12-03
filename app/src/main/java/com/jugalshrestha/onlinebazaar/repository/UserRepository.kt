package com.jugalshrestha.onlinebazaar.repository

import com.jugalshrestha.onlinebazaar.api.MyApiRequest
import com.jugalshrestha.onlinebazaar.api.ServiceBuilder
import com.jugalshrestha.onlinebazaar.api.UserAPI
import com.jugalshrestha.onlinebazaar.entity.User
import com.jugalshrestha.onlinebazaar.response.LoginResponse

class UserRepository : MyApiRequest() {
    private val userAPI = ServiceBuilder.buildService(UserAPI::class.java)

    suspend fun registerUser(user: User): LoginResponse {
        return apiRequest {
            userAPI.registerUser(user)
        }
    }

    suspend fun checkUser(user_email: String, user_password: String):LoginResponse{
        return apiRequest {
            userAPI.checkUser(user_email, user_password)
        }
    }

    //Retrieve User
    suspend fun userDetails(token:String,userToken:String): LoginResponse {
        return apiRequest {
            userAPI.retrieveUser(ServiceBuilder.token!!,userToken)
        }
    }

}