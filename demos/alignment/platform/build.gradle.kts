plugins {
    `java-platform`
    `maven-publish`
}

group = "org.example"
version = "1.0"

dependencies {
    constraints {
        api(project(":list"))
        api(project(":utilities"))
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["javaPlatform"])
        }
    }
    repositories {
        maven {
            url = uri("${rootProject.projectDir}/build/repo")
        }
    }
}