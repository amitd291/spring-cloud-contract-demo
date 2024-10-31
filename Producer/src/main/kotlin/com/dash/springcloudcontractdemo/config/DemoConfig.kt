package com.dash.springcloudcontractdemo.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "demo-config")
class DemoConfig {
    lateinit var environment: String
}
