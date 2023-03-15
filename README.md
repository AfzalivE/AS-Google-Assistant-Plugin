# AS Google Assistant plugin

![Build](https://github.com/AfzalivE/AS-Google-Assistant-Plugin/workflows/Build/badge.svg)

<!-- Plugin description -->
The Google Assistant plugin enables you to test and validate your App Actions and Shortcuts integrations with a convenient UI to specify the intent and parameters you would like to invoke. Supported on Android Studio 4.0+.

Features:
    - Simple UI to specify the intent and parameters and directly initiate the experience in Assistant
  - Support for enabling a preview of voice query invocation in Assistant for select sample queries only

To learn more about how to use the plugin, visit the App Actions documentation. The Google Assistant plugin is still in Beta. You can find known issues here. We also want to hear from you if you encounter any bugs - please share your feedback on our Public Issue Tracker.
<!-- Plugin description end -->

This is a compilable project from a decompiled [Google Assistant plugin](https://plugins.jetbrains.com/plugin/16739-google-assistant) for Android Studio.

## Building

1. Open the project in IDEA.
1. Update `ideDir` and `androidJarDir` in `gradle.properties`!
1. To build a zip file to install in Android Studio, run the `buildPlugin` task.

## Known issues

- Sometimes, the `Create Preview` button does nothing, a Gradle Sync or Restarting Android Studio is able to fix that.
- Giraffe and Flamingo version are compatible but they're not compatible with Electric Eel.

Electric Eel and Dolphin versions have a different way of importing some dependencies because I hadn't figured out that all the jars I needed were in the `Android Studio.app` package.
