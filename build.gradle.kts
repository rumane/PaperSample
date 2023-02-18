plugins {
    kotlin("jvm") version "1.8.0"
    id("io.papermc.paperweight.userdev") version "1.5.1"
    id("net.minecrell.plugin-yml.bukkit") version "0.5.2"
}

bukkit {
    name = "PaperSample"
    author = "JUNHYEOK"
    version = "1.0.0"
    apiVersion = "1.19"
    main = "io.github.junhyeok.plugin.${name}Plugin"
}

repositories {
    mavenCentral()
}

dependencies {
    paperweight.paperDevBundle("1.19.3-R0.1-SNAPSHOT")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

kotlin {
//    (this as JavaToolchainSpec).languageVersion.set(JavaLanguageVersion.of(17))
}

tasks {
    assemble {
        dependsOn(reobfJar)
    }
    compileJava {
        options.encoding = Charsets.UTF_8.name()
        options.release.set(17)
    }
    javadoc {
        options.encoding = Charsets.UTF_8.name()
    }
    processResources {
        filteringCharset = Charsets.UTF_8.name()
    }
}