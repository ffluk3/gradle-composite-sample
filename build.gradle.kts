
plugins {
    base
}

val aggregateTasks = listOf("clean", "build", "assemble", "check")

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