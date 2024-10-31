package com.dash.springcloudcontractdemo.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("demo-config")
class DemoConfigProps(val environment: String)
