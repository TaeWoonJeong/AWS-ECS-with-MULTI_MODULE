package com.example.module1.controller

import com.example.module1.dto.AddUserRequestDto
import com.example.module1.dto.GetUserResponseDto
import com.example.module1.service.Service
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime
import java.util.UUID


@RestController
class Controller(private val environment: Environment, private val service: Service) {
    private val uuid = UUID.randomUUID()
    @GetMapping("/")
    fun get():String {
        val port: String? = environment.getProperty("local.server.port")
        return "module1의 현재 시간은 "+LocalDateTime.now().toString() + "이고, 포트는 $port 입니다. uuid 값 : $uuid"
    }

    @PostMapping("/addUser")
    fun addUser(@RequestBody addUserRequestDto: AddUserRequestDto) {
        service.addUser(addUserRequestDto)
    }

    @GetMapping("/getUser")
    fun getUser(): List<GetUserResponseDto> {
        return service.getUser()
    }
}