package com.example.module2.controller

import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime


@RestController
class Controller(private val environment: Environment) {
    @GetMapping("/")
    fun get():String {
        val port: String? = environment.getProperty("local.server.port")
        return "module2의 현재 시간은 "+LocalDateTime.now().toString() + "이고, 포트는 $port 입니다."
    }
}