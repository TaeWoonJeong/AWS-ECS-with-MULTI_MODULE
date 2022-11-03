package com.example.module1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class Module1Application

fun main(args: Array<String>) {
    runApplication<Module1Application>(*args)
}
