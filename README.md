# Prism Mod Template

A multi-version Minecraft mod template powered by [Prism](https://github.com/Leclowndu93150/Prism).

## Versions included

| Minecraft | Mode | Loaders |
|-----------|------|---------|
| 1.20.1 | Multi-loader | Fabric + Forge |
| 1.21.1 | Single-loader | NeoForge |
| 26.1 | Single-loader | NeoForge |

## Setup

1. Click "Use this template" on GitHub
2. Clone your new repository
3. Open in IntelliJ IDEA
4. Wait for Gradle sync to complete
5. Start coding

## Project structure

```
versions/
  1.20.1/                      multi-loader
    common/src/main/java/      shared code (vanilla MC)
    fabric/src/main/java/      Fabric-specific
    forge/src/main/java/       Forge-specific
  1.21.1/                      single-loader
    src/main/java/             all code here
    src/main/resources/
  26.1/                        single-loader
    src/main/java/
    src/main/resources/
```

## Building

```bash
./gradlew build                    # build everything
./gradlew :1.20.1:fabric:build     # multi-loader target
./gradlew :1.21.1:build            # single-loader target
./gradlew :1.21.1:runClient        # run single-loader
```

## Configuration

Edit `build.gradle.kts` to change mod metadata, loader versions, and dependencies. See the [Prism documentation](https://leclowndu93150.github.io/Prism/) for the full DSL reference.

## License

MIT
