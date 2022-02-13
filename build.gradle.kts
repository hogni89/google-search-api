plugins {
    id("org.jetbrains.kotlin.jvm") version "1.6.10"
}

group = "com.beinisson"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    val arkenvVersion = "3.3.3"
    val gsonVersion = "2.8.2"

    implementation("com.apurebase:arkenv:$arkenvVersion")
    implementation("com.google.code.gson:gson:$gsonVersion")
}

tasks {
    compileKotlin {
        kotlinOptions {
            jvmTarget = "11"
        }
    }
}