
# Composite Build Sample

This sample demonstrates how to use composite builds to work with multiple projects in a single build.

## Usage

To run the sample, execute the following command from the root of the composite project:

```bash
gradle buildAll
```

You can also open up any folder with a `settings.gradle.kts` file in IntelliJ IDEA and it will automatically recognize 
the composite build. Note that included builds are encoded both at the project root and the individual settings files, 
to preserve both a top-down experience and a per-build experience.