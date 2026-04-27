plugins {
    kotlin("jvm") version "2.0.21"
    `maven-publish`
}

group = "dev.norbix"
val shaVersion = System.getenv("GITHUB_SHA")?.take(8)
version = System.getenv("NORBIX_VERSION") ?: if (shaVersion != null) "0.0.0-$shaVersion" else "0.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.google.code.gson:gson:2.11.0")

    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.11.3")
}

kotlin {
    jvmToolchain(17)
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            groupId = project.group.toString()
            artifactId = "norbix-kotlin"
            version = project.version.toString()
        }
    }
    repositories {
        maven {
            name = "githubPackages"
            url = uri("https://maven.pkg.github.com/norbix-dev/norbix-kotlin")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
