pluginManagement {
    repositories {
        maven { url = uri("https://maven.leclowndu93150.dev/releases") }
        gradlePluginPortal()
        mavenCentral()
        maven { url = uri("https://maven.fabricmc.net/") }
        maven { url = uri("https://maven.neoforged.net/releases") }
        maven { url = uri("https://repo.spongepowered.org/repository/maven-public/") }
        maven { url = uri("https://nexus.gtnewhorizons.com/repository/public/") }
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
    id("dev.prism.settings") version "+"
}

rootProject.name = "my-mod"

prism {
    // Multi-loader: common + fabric + forge
    version("1.20.1") {
        common()
        fabric()
        forge()
    }

    // Multi-loader: common + neoforge + lexforge (FG7 for modern Forge)
    version("1.21.1") {
        common()
        neoforge()
        lexForge()
    }

    // Single-loader: just fabric
    version("26.1") {
        fabric()
    }

    // Legacy Forge 1.12.2 (RetroFuturaGradle)
    version("1.12.2") {
        legacyForge()
    }
}
