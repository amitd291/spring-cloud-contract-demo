package com.dash.springcloudcontractdemo

import com.dash.springcloudcontractdemo.config.DemoConfigProps
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(DemoConfigProps::class)
class SpringCloudContractDemoApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudContractDemoApplication>(*args)
}
