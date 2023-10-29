package com.example.seeyou

class UserRepository(private val userApi : UserApi) {

    fun getByDistance(meters: Int): List<User> {
        return listOf(User("someId" , "someName", Location(45.45, 13.12)))
    }
}