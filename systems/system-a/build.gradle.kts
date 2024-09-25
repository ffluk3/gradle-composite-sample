plugins {
    base
}

val aggregateTasks = listOf("clean", "build", "assemble", "check")

/**
 * This snippet configures an included build to have an expected aggregate task which aligns with the standard
 * Base plugin, leveraged when referencing tasks across builds
 */
tasks {
    aggregateTasks.forEach { taskName ->
        named(taskName).configure {
            dependsOn(
                getTasksByName(taskName, true).filter { it != this@configure },
            )
        }

        named(taskName).configure {
            dependsOn(
                gradle.includedBuilds.map { it.task(":$taskName") }
            )
        }
    }
}