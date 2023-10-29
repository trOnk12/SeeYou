package com.example.seeyou.android

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.seeyou.Location
import com.example.seeyou.UserApi
import com.example.seeyou.UserRepository

@Composable
fun HomeScreen() {
    val nearbyPeople = UserRepository(UserApi()).getByDistance(10)

    LazyColumn {
        items(nearbyPeople) {
            NearbyPeopleItem(it.name, it.location)
        }
    }
}

@Composable
private fun NearbyPeopleItem(
    name: String,
    location: Location
) {
    Column {
        Text(name)
    }
}