pluginManagement {
    repositories {
        mavenCentral()
        maven { url = uri("https://repo.spring.io/snapshot") }
        maven { url = uri("https://repo.spring.io/milestone") }
        maven { url = uri("https://repo.spring.io/release") }
    }

    plugins {
        val kotlinVersion: String by settings
        val springBootVersion: String by settings
        val springDepVersion: String by settings
        val springVerifierVersion: String by settings

        id("org.springframework.boot") version springBootVersion
        id("io.spring.dependency-management") version springDepVersion
        id("org.springframework.cloud.contract") version springVerifierVersion
        kotlin("jvm") version kotlinVersion
        kotlin("plugin.spring") version kotlinVersion
    }
}

rootProject.name = "SpringCloudContractDemo"