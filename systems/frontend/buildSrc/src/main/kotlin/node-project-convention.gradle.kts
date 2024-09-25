import com.github.gradle.node.yarn.task.YarnTask

plugins {
    base
    id("com.github.node-gradle.node")
}

tasks {
    register<YarnTask>("yarnStart") {
        dependsOn("yarn")
        args = listOf("start")
    }

    val yarnBuildTask = register<YarnTask>("yarnBuild") {
        dependsOn("yarn")
        args = listOf("build")
    }

    val yarnTestTask = register<YarnTask>("test") {
        dependsOn("yarn")
        args = listOf("test")
    }

    named("assemble") {
        dependsOn(yarnBuildTask)
    }

    named("check") {
        dependsOn(yarnTestTask)
    }
}