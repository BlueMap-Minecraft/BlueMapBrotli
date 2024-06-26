plugins {
    java
    id ("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "de.bluecolored.bluemap.brotli"
version = "1.0"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(16))
    withSourcesJar()
}

repositories {
    mavenCentral()
    maven ( "https://repo.bluecolored.de/releases" )
}

dependencies {
    compileOnly ( "de.bluecolored.bluemap:BlueMapCore:5.0" )

    implementation ( group = "com.aayushatharva.brotli4j", name = "brotli4j", version = "1.16.0" )
    runtimeOnly ( group = "com.aayushatharva.brotli4j", name = "native-windows-x86_64", version = "1.16.0" )
    runtimeOnly ( group = "com.aayushatharva.brotli4j", name = "native-windows-aarch64", version = "1.16.0" )
    runtimeOnly ( group = "com.aayushatharva.brotli4j", name = "native-linux-x86_64", version = "1.16.0" )
    runtimeOnly ( group = "com.aayushatharva.brotli4j", name = "native-linux-aarch64", version = "1.16.0" )
    runtimeOnly ( group = "com.aayushatharva.brotli4j", name = "native-linux-armv7", version = "1.16.0" )
    runtimeOnly ( group = "com.aayushatharva.brotli4j", name = "native-linux-ppc64le", version = "1.16.0" )
    runtimeOnly ( group = "com.aayushatharva.brotli4j", name = "native-linux-riscv64", version = "1.16.0" )
    runtimeOnly ( group = "com.aayushatharva.brotli4j", name = "native-linux-s390x", version = "1.16.0" )
    runtimeOnly ( group = "com.aayushatharva.brotli4j", name = "native-osx-x86_64", version = "1.16.0" )
    runtimeOnly ( group = "com.aayushatharva.brotli4j", name = "native-osx-aarch64", version = "1.16.0" )
}

tasks.shadowJar {
    relocate( "com.aayushatharva.brotli4j", "de.bluecolored.shadow.brotli4j" )

    doLast {
        destinationDirectory.file(archiveFileName).get().asFile
            .copyTo(projectDir.resolve("build/release/bluemap-brotli-$version.jar"))
    }
}

tasks.withType(JavaCompile::class).configureEach {
    options.encoding = "utf-8"
}

tasks.withType(AbstractArchiveTask::class).configureEach {
    isReproducibleFileOrder = true
    isPreserveFileTimestamps = false
}
