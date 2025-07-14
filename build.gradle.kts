plugins {
    id("fabric-loom") version "1.5-SNAPSHOT"
    kotlin("jvm") version "1.7.10"
}

version = "1.0.0"
group = "com.mythicclient"

repositories {
    maven("https://maven.fabricmc.net/")
    mavenCentral()
    // add Krypton & Meteor repos
}

dependencies {
    minecraft("com.mojang:minecraft:1.20.4")
    mappings("net.fabricmc:yarn:1.20.4+build.5:v2")
    modImplementation("net.fabricmc:fabric-loader:0.15.7")
    modImplementation("meteordevelopment:meteor-client:0.25.1")
    modImplementation("me.astei:krypton:1.0.11")
}
