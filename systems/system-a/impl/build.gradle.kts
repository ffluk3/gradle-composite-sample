plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.sample:string-utils:1.0")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
