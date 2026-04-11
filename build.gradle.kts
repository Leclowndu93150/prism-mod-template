plugins {
    id("dev.prism")
}

group = "com.example"
version = "1.0.0"

prism {
    metadata {
        modId = "mymod"
        name = "My Mod"
        description = "A Minecraft mod built with Prism."
        license = "MIT"
        author("YourName")
    }

    // Multi-loader: shared common + fabric + forge
    version("1.20.1") {
        fabric {
            loaderVersion = "0.18.6"
            fabricApi("0.92.7+1.20.1")
        }
        forge {
            loaderVersion = "47.4.18"
            loaderVersionRange = "[47,)"
        }
    }

    // Multi-loader: neoforge + lexforge (MinecraftForge via ForgeGradle 7)
    version("1.21.1") {
        neoforge {
            loaderVersion = "21.1.222"
            loaderVersionRange = "[4,)"
        }
        lexForge {
            loaderVersion = "52.1.9"
            loaderVersionRange = "[52,)"
        }
    }

    // Single-loader: just fabric
    version("26.1") {
        fabric {
            loaderVersion = "0.18.6"
            fabricApi("0.145.2+26.1.1")
        }
    }

    // Legacy Forge 1.12.2
    version("1.12.2") {
        legacyForge {
            mcVersion = "1.12.2"
            forgeVersion = "14.23.5.2847"
            mappingChannel = "stable"
            mappingVersion = "39"
            username = "Developer"
        }
    }
}
