# Prism Mod Template

A multi-version, multi-loader Minecraft mod template powered by [Prism](https://github.com/Leclowndu93150/Prism).

## Versions included

| Minecraft | Fabric | NeoForge | Forge |
|-----------|--------|----------|-------|
| 1.20.1    | Yes    |          | Yes   |
| 1.21.1    | Yes    | Yes      |       |
| 26.1      | Yes    | Yes      |       |

## Setup

1. Click "Use this template" on GitHub
2. Clone your new repository
3. Open in IntelliJ IDEA
4. Wait for Gradle sync to complete
5. Start coding

## Project structure

```
versions/
  1.20.1/
    common/    shared code compiled against vanilla MC
    fabric/    Fabric-specific code and resources
    forge/     Forge-specific code and resources
  1.21.1/
    common/
    fabric/
    neoforge/
  26.1/
    common/
    fabric/
    neoforge/
```

Each version is independent. Common code within a version is shared across its loaders.

## Building

```bash
./gradlew build                        # build everything
./gradlew :1.21.1:fabric:build         # build specific target
./gradlew :26.1:neoforge:runClient     # run specific target
```

## Configuration

Edit `build.gradle.kts` to change mod metadata, loader versions, and dependencies. See the [Prism documentation](https://leclowndu93150.github.io/Prism/) for the full DSL reference.

## License

MIT
