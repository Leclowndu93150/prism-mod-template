pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven { url = uri("https://maven.fabricmc.net/") }
        maven { url = uri("https://maven.neoforged.net/releases") }
        maven { url = uri("https://repo.spongepowered.org/repository/maven-public/") }
    }
}

plugins {
    id("dev.prism.settings")
}

rootProject.name = "my-mod"

prism {
    version("1.20.1") {
        common()
        fabric()
        forge()
    }
    version("1.21.1") {
        common()
        fabric()
        neoforge()
    }
    version("26.1") {
        common()
        fabric()
        neoforge()
    }
}
