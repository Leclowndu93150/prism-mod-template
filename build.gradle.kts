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

    version("1.21.1") {
        fabric {
            loaderVersion = "0.18.6"
            fabricApi("0.116.9+1.21.1")
        }
        neoforge {
            loaderVersion = "21.1.222"
            loaderVersionRange = "[4,)"
        }
    }

    version("26.1") {
        fabric {
            loaderVersion = "0.18.6"
            fabricApi("0.145.2+26.1.1")
        }
        neoforge {
            loaderVersion = "26.1.1.0-beta"
            loaderVersionRange = "[4,)"
        }
    }
}
