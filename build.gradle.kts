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

    implementation("com.apurebase:arkenv:$arkenvVersion")
}

tasks {
    compileKotlin {
        kotlinOptions {
            jvmTarget = "11"
        }
    }
}