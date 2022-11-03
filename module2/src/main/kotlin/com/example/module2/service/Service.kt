package com.example.module2.service

import com.example.module2.dto.GetUserResponseDto
import com.example.module2.entity.User
import com.example.module2.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class Service(private val userRepository: UserRepository) {
    fun addUser(username:String, email:String) {
        userRepository.save(User(id = null, username = username, email = email))
    }

    fun getUser(): List<GetUserResponseDto> {
        return userRepository.findAll().map { user-> GetUserResponseDto(user.id!!, user.username, user.email) }
    }
}