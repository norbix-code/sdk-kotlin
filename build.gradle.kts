import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
    kotlin("jvm") version "2.2.21"
    id("com.vanniktech.maven.publish") version "0.37.0"
}

group = "ai.norbix"
// The release workflow passes the version computed by semantic-release
// (NORBIX_VERSION). Local and CI builds get a snapshot version.
version = System.getenv("NORBIX_VERSION") ?: "0.0.0-SNAPSHOT"

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
    compilerOptions {
        // The publish plugin needs the Kotlin Gradle plugin 2.2+, but consumers
        // should not need a newer Kotlin than before: emit 2.0-level metadata and
        // API so projects on Kotlin 2.0 can use the published jar.
        languageVersion.set(KotlinVersion.KOTLIN_2_0)
        apiVersion.set(KotlinVersion.KOTLIN_2_0)
    }
}

tasks.test {
    useJUnitPlatform()
}

// Maven Central (Sonatype Central Portal). Credentials and the signing key come
// from ORG_GRADLE_PROJECT_* environment variables set by the release workflow:
// mavenCentralUsername / mavenCentralPassword (Portal user token) and
// signingInMemoryKey / signingInMemoryKeyPassword (ASCII-armored GPG key).
mavenPublishing {
    configure(KotlinJvm(javadocJar = JavadocJar.Empty(), sourcesJar = true))
    publishToMavenCentral(automaticRelease = true)
    signAllPublications()

    coordinates(group.toString(), "norbix-kotlin", version.toString())

    pom {
        name.set("Norbix Kotlin SDK")
        description.set(
            "Official Kotlin/JVM SDK for Norbix: NorbixApi (project data plane, api.norbix.ai) " +
                "and NorbixHub (project / account configuration plane, hub.norbix.ai).",
        )
        inceptionYear.set("2026")
        url.set("https://github.com/norbix-code/sdk-kotlin")
        licenses {
            license {
                name.set("MIT License")
                url.set("https://github.com/norbix-code/sdk-kotlin/blob/main/LICENSE")
                distribution.set("repo")
            }
        }
        developers {
            developer {
                id.set("norbix")
                name.set("UAB Isidos")
                url.set("https://norbix.ai")
            }
        }
        scm {
            url.set("https://github.com/norbix-code/sdk-kotlin")
            connection.set("scm:git:https://github.com/norbix-code/sdk-kotlin.git")
            developerConnection.set("scm:git:ssh://git@github.com/norbix-code/sdk-kotlin.git")
        }
    }
}
