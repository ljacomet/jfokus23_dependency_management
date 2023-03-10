/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    // Apply the common convention plugin for shared build configuration between library and application projects.
    id("org.example.java-common-conventions")

    // Apply the java-library plugin for API and implementation separation.
    `java-library`
    `maven-publish`
}

group = "org.example"
version = "1.0"

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }

    repositories {
        maven {
            url = uri("${rootProject.projectDir}/build/repo")
        }
    }
}