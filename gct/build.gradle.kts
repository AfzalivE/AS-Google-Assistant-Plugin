fun properties(key: String) = project.findProperty(key).toString()

plugins {
    // Java support
    id("java")
    // Kotlin support
    id("org.jetbrains.kotlin.jvm")
}

group = "com.github.afzalive.firstintellijplugin"
version = "0.0.2"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation(kotlin("stdlib-jdk8"))
    compileOnly(fileTree("../libs") { include("*.jar") })
    // Needed because this isn't an intellij plugin module, so we need to get IDEA classes from somewhere.
    compileOnly(fileTree("/Users/afzal/Dev/Android Studio.app/Contents/lib") { include("*.jar") })
    // https://mvnrepository.com/artifact/com.google.apis/google-api-services-oauth2
    implementation("com.google.apis:google-api-services-oauth2:v2-rev66-1.17.0-rc")

    implementation("javax.servlet:javax.servlet-api:3.0.1")
}
