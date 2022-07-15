

group = "io.h4h"
version = "0.1.0-alpha1"


plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.6.21"

    // Apply the java-library plugin for API and implementation separation.
    `java-library`
    // Publish to Maven repository
    `maven-publish`

    // Publish to GCP Artifact Registry repository
    id("com.google.cloud.artifactregistry.gradle-plugin") version "2.1.4"

    // Kotlinx Serialization
    kotlin("plugin.serialization") version "1.6.21"
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()

    // GCP Artifact Registry
    maven {
        url = uri("artifactregistry://europe-west4-maven.pkg.dev/ehealth-development/java-repository-1")
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

    // publish on GCP Artifact Registry
    repositories {
        maven {
            url = uri("artifactregistry://europe-west4-maven.pkg.dev/ehealth-development/java-repository-1")
        }
    }
}


dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // base definitions of FHIR data structures
    implementation("io.h4h:fhir-base-kotlin:0.1.3-alpha1")
    // https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-serialization-core-jvm
    api("org.jetbrains.kotlinx:kotlinx-serialization-core-jvm:1.3.3")


    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}
