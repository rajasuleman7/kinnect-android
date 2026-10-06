# Kinnect

Kinnect is an Android social-app UI prototype written in Kotlin with XML layouts
(package `com.rajasulemantariq.i230848`). It contains 23 screens connected with
explicit `Intent` navigation; screen content is static and there is no backend.

## Screens
Splash, Login, Signup, Home feed, Menu, Comments, Reactions, Create post,
Photo picker, Camera, Story editor, Story viewer, Your story, Profile,
Edit profile, Other profile, Friends, Search, Chats, Chat, Voice call,
Marketplace, Notifications.

## Tech
- Kotlin, AndroidX AppCompat, ConstraintLayout, Material Components
- Gradle Kotlin DSL with a version catalog (`gradle/libs.versions.toml`)
- minSdk 24, targetSdk/compileSdk 37, Java 11
- Espresso tests: `LoginMenuLogoutTest`, `HomeCommentsBackTest`

## Build
Open the project in Android Studio and run the `app` configuration, or:

    ./gradlew assembleDebug

`local.properties` (SDK path) is machine-specific and not committed.
