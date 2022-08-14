pluginManagement {
    repositories {
        mavenCentral()
        mavenLocal()
        maven { url = uri("https://repo.spring.io/snapshot") }
        maven { url = uri("https://repo.spring.io/milestone") }
        maven { url = uri("https://repo.spring.io/release") }
        gradlePluginPortal()
    }

    plugins {
        val verifierVersion = extra["verifierVersion"]

        id("org.springframework.cloud.contract") version "$verifierVersion"
    }
}

rootProject.name = "SpringCloudContractDemo"