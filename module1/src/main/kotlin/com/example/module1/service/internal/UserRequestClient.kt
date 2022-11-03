package com.example.module1.service.internal

import com.example.module1.dto.AddUserRequestDto
import com.example.module1.dto.GetUserResponseDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@FeignClient(name = "user-request", url = "\${server.module2.url}")
interface UserRequestClient {

    @PostMapping("/internal/addUser")
    fun addUserRequest(@RequestBody addUserRequestDto: AddUserRequestDto)

    @GetMapping("/internal/getUser")
    fun getUserRequest() : List<GetUserResponseDto>
}