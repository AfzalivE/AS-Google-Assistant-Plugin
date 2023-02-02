# AS Google Assistant plugin

![Build](https://github.com/AfzalivE/AS-Google-Assistant-Plugin/workflows/Build/badge.svg)

This is a compilable project from a decompiled [Google Assistant plugin](https://plugins.jetbrains.com/plugin/16739-google-assistant) for Android Studio.

## Building

1. Open the project in IDEA.
1. Update `ideDir` and `androidJarDir` in `gradle.properties`!
1. To build a zip file to install in Android Studio, run the `buildPlugin` task.

## Known issues

- Sometimes, the `Create Preview` button does nothing, a Gradle Sync or Restarting Android Studio is able to fix that.
- Giraffe and Flamingo version are compatible but they're not compatible with Electric Eel.

Electric Eel and Dolphin versions have a different way of importing some dependencies because I hadn't figured out that all the jars I needed were in the `Android Studio.app` package.
