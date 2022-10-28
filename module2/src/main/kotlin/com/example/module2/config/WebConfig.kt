package com.example.module2.config

import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.converter.StringHttpMessageConverter
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import java.nio.charset.StandardCharsets

@Configuration
class WebConfig : WebMvcConfigurer {
    override fun configureMessageConverters(converters: MutableList<HttpMessageConverter<*>>) {
        val converter = StringHttpMessageConverter(StandardCharsets.UTF_8)
        converter.setWriteAcceptCharset(false)
        converters.add(converter)

        super.configureMessageConverters(converters)
    }
}