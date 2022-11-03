package com.example.module2.controller.internal

import com.example.module2.dto.AddUserRequestDto
import com.example.module2.dto.GetUserResponseDto
import com.example.module2.entity.User
import com.example.module2.service.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/internal")
@RestController
class InternalController(private val service: Service) {
    @PostMapping("/addUser")
    fun addUserRequest(@RequestBody addUserRequestDto: AddUserRequestDto) {
        service.addUser(addUserRequestDto.username, addUserRequestDto.email)
    }

    @GetMapping("/getUser")
    fun getUserRequest(): List<GetUserResponseDto> {
        return service.getUser()
    }
}