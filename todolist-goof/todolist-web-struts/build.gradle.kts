/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    war
}

dependencies {
    implementation(project(":todolist-web-common"))
    implementation("org.apache.logging.log4j:log4j-core:2.7")
    implementation("org.apache.logging.log4j:log4j-api:2.7")
    implementation("org.springframework:spring-web:3.2.6.RELEASE")
    implementation("org.apache.struts:struts2-core:2.3.20")
    implementation("org.apache.struts:struts2-spring-plugin:2.3.20")
    implementation("org.zeroturnaround:zt-zip:1.12")
    providedCompile("javax:javaee-web-api:7.0")
}

description = "Java Goof :: Todolist Goof :: Todolist Web Struts"
