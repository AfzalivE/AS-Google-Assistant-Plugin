fun properties(key: String) = project.findProperty(key).toString()

plugins {
    // Java support
    id("java")
    // Kotlin support
    id("org.jetbrains.kotlin.jvm")
    // Gradle IntelliJ Plugin
//    id("org.jetbrains.intellij")
}

group = "com.github.afzalive.firstintellijplugin"
version = "0.0.2"

repositories {
    mavenCentral()
}

// Configure Gradle IntelliJ Plugin - read more: https://github.com/JetBrains/gradle-intellij-plugin
//intellij {
//    pluginName.set(properties("pluginName"))
//    localPath.set("/Users/afzal/Dev/Android Studio.app/Contents")
////    version.set(properties("platformVersion"))
//    type.set(properties("platformType"))
//
//    // Plugin Dependencies. Uses `platformPlugins` property from the gradle.properties file.
//    plugins.set(properties("platformPlugins").split(',').map(String::trim).filter(String::isNotEmpty))
//}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation(kotlin("stdlib-jdk8"))
    compileOnly(fileTree("../libs") { include("*.jar") })
    compileOnly(fileTree("/Users/afzal/Dev/Android Studio.app/Contents/lib") { include("*.jar") })
    // https://mvnrepository.com/artifact/com.google.apis/google-api-services-oauth2
    implementation("com.google.apis:google-api-services-oauth2:v2-rev66-1.17.0-rc")

    implementation("javax.servlet:javax.servlet-api:3.0.1")
}

tasks {
//    named("instrumentCode") {
//        setProperty("compilerVersion", "213.6461.79")
//    }
}
