package com.jugalshrestha.onlinebazaar.api

import com.jugalshrestha.onlinebazaar.entity.User
import com.jugalshrestha.onlinebazaar.response.LoginResponse
import retrofit2.Response
import retrofit2.http.*

interface UserAPI {
    //Register user
    @POST("user/register")
    suspend fun registerUser(
        @Body user: User
    ): Response<LoginResponse>


    //Login
    @FormUrlEncoded
    @POST("user/login")
    suspend fun checkUser(
        @Field("user_email") user_email:String,
        @Field("user_password") user_password:String
    ): Response<LoginResponse>


    //retrieve User
    @GET("user/show/{id}")
    suspend fun retrieveUser(
        @Header("Authorization") token:String,
        @Field("token") userToken:String
    ):Response<LoginResponse>

    @PUT("user/update/{id}")
    suspend fun updateUser(
        @Header("Authorization")token: String
    ):Response<LoginResponse>
}
