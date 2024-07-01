

group = "io.h4h"
version = "0.2.4"


plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.9.22"

    // Apply the java-library plugin for API and implementation separation.
    `java-library`
    // Publish to Maven repository
    `maven-publish`

    // Kotlinx Serialization
    kotlin("plugin.serialization") version "1.9.22"
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()

    // GCP Artifact Registry
    maven {
        url = uri("https://maven.pkg.github.com/heartforhealth/terminology")
        credentials {
            username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
            password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN")
        }
    }
}


publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "io.h4h"
            artifactId = rootProject.name

            from(components["java"])
        }
    }

    repositories {
        // publish on GitHub Packages
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/heartforhealth/terminology")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("GITHUB_USERNAME")
                password = project.findProperty("gpr.key") as String? ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
}


dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // base definitions of FHIR data structures
    api("io.h4h:fhir-base-kotlin:0.2.2")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}
