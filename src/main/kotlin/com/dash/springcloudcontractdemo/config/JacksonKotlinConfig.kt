package com.dash.springcloudcontractdemo.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.context.annotation.Bean

class JacksonKotlinConfig {
    @Bean
    fun provideJacksonForKotlin(): ObjectMapper =
        jacksonObjectMapper()
}