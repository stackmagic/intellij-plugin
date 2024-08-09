plugins {
    id("java")
    //id("org.jetbrains.kotlin.jvm") version "1.9.24"
    id("org.jetbrains.intellij.platform") version "2.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    intellijPlatform {
        localPlatformArtifacts()
        intellijDependencies()
    }
}

dependencies {
    intellijPlatform {
        local("$projectDir/idea-IU-242.20224.300")
        instrumentationTools()
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

intellijPlatform {
}
