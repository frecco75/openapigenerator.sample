package com.openapi.sample.api

import com.openapi.sample.model.User
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.notFound
import org.springframework.http.ResponseEntity.ok
import org.springframework.stereotype.Service

@Service
class UsersApiServiceImpl : UsersApiService {

    private companion object {
        private val users = setOf(
            User("007", "Bond"),
            User("42", "Chuck Norris")
        )
    }

    override fun usersUserIdGet(userId: String): ResponseEntity<User> =
        users.find { it.id == userId }
            ?.let(::ok)
            ?: notFound().build()
}