import org.gradle.kotlin.dsl.repositories

buildscript {
    repositories {
        maven { setUrl("http://dl.bintray.com/jetbrains/intellij-plugin-service") }
    }
}
plugins {
    id("org.jetbrains.intellij") version "0.2.17"
}

group = "cn.javaer"
version = "1.0-SNAPSHOT"

intellij {
    version = "2017.2.5"
    updateSinceUntilBuild = false
    setPlugins("net.seesharpsoft.intellij.plugins.csv:1.3")
}