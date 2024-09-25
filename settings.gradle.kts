rootProject.name = "gradle-composite-sample"

includeBuild("platform")
includeBuild("monolith")

includeBuild("systems/system-a")
includeBuild("systems/system-b")
includeBuild("systems/frontend")