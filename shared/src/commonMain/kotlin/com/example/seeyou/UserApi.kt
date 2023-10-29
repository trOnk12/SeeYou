package com.example.seeyou

class UserApi {

    fun getByDistance(meters: Int): List<UserApiModel> {
        return emptyList()
    }

}


data class UserApiModel(
    val id: String,
    val name: String,
    val location: LocationApiModel
)

fun UserApiModel.toDomain() = User(
    id = id,
    name = name,
    location = Location(
        latitude = location.latitude,
        longitude = location.longitude
    )
)

data class LocationApiModel(
    val latitude: Double,
    val longitude: Double
)

