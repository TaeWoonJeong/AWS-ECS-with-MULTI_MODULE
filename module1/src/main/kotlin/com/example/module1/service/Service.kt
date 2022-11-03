package com.example.module1.service

import com.example.module1.dto.AddUserRequestDto
import com.example.module1.dto.GetUserResponseDto
import com.example.module1.service.internal.UserRequestClient
import org.springframework.stereotype.Service

@Service
class Service(private val userRequestClient: UserRequestClient) {
    fun addUser(addUserRequestDto: AddUserRequestDto) {
        userRequestClient.addUserRequest(addUserRequestDto)
    }

    fun getUser(): List<GetUserResponseDto> {
        return userRequestClient.getUserRequest()
    }
}