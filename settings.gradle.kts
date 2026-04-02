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
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}

buildscript {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven { url = uri("https://maven.fabricmc.net/") }
        maven { url = uri("https://maven.neoforged.net/releases") }
        maven { url = uri("https://repo.spongepowered.org/repository/maven-public/") }
        maven { url = uri("https://libraries.minecraft.net/") }
    }
    dependencies {
        classpath(files("libs/prism-gradle-plugin-0.1.0.jar"))
        classpath("net.fabricmc:fabric-loom:1.15.5")
        classpath("net.neoforged:moddev-gradle:2.0.141")
        classpath("me.modmuss50:mod-publish-plugin:1.1.0")
    }
}

apply(plugin = "dev.prism.settings")

rootProject.name = "my-mod"

extensions.configure<dev.prism.gradle.dsl.PrismSettingsExtension>("prism") {
    // Multi-loader: common + fabric + forge
    version("1.20.1") {
        common()
        fabric()
        forge()
    }

    // Single-loader: just neoforge, no common/loader split
    version("1.21.1") {
        neoforge()
    }

    // Single-loader: just fabric
    version("26.1") {
        fabric()
    }
}
