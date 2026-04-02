apply(plugin = "dev.prism")

group = "com.example"
version = "1.0.0"

extensions.configure<dev.prism.gradle.dsl.PrismExtension>("prism") {
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

    // Single-loader: just neoforge, all code in one folder
    version("1.21.1") {
        neoforge {
            loaderVersion = "21.1.222"
            loaderVersionRange = "[4,)"
        }
    }

    // Single-loader: just fabric
    version("26.1") {
        fabric {
            loaderVersion = "0.18.6"
            fabricApi("0.145.2+26.1.1")
        }
    }
}
