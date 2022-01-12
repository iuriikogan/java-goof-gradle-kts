/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("io.github.snyk.java-conventions")
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-core:2.6.5")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.6.5")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.6.5")
    implementation(project(":todolist-core"))
    implementation("javax:javaee-web-api:7.0")
    implementation("javax.servlet:jstl:1.2")
    implementation("org.hibernate:hibernate-validator:4.3.1.Final")
}

description = "Java Goof :: Todolist Goof :: Todolist Web Common"
