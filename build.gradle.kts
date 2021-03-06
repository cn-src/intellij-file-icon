import org.gradle.kotlin.dsl.repositories

plugins {
    id("org.jetbrains.intellij") version "0.3.1"
}

group = "cn.javaer"
version = "1.2"

tasks.withType(JavaCompile::class.java) {
    options.encoding = "UTF-8"
}

intellij {
    version = "2018.1.1"
    updateSinceUntilBuild = false
    setPlugins(
        "net.seesharpsoft.intellij.plugins.csv:1.3",
        "com.vladsch.idea.multimarkdown:2.3.8",
        "org.jodd.idea.props:0.6",
        "no.tornado.tornadofx.idea:1.7.14.1"
    )
}