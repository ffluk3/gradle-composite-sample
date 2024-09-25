tasks {
    register("buildAll") {
        gradle.includedBuilds.forEach {
            this.dependsOn(it.task(":build"))
        }
    }

    register("checkAll") {
        gradle.includedBuilds.forEach {
            this.dependsOn(it.task(":check"))
        }
    }

    register("cleanAll") {
        gradle.includedBuilds.forEach {
            this.dependsOn(it.task(":check"))
        }
    }
}