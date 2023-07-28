/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    java
    id("slsa-verification-plugin") version "0.0.1"
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("org.springframework:spring-webmvc:6.0.10")
    implementation("org.json:json:20230227")
    implementation("io.github.adamkorcz:test-java-project:0.1.19")
}

group = "io.github.adamkorcz"
version = "0.0.1"
description = "Slsa Verification Testing Project"
java.sourceCompatibility = JavaVersion.VERSION_1_8
