package com.example.seeyou

class UserRepository(
    private val userApi: UserApi
) {

    fun getByDistance(meters: Int): List<User> = userApi.getByDistance(meters).map { it.toDomain() }

}