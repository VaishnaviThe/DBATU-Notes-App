buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(libs.google.services)
        classpath("com.android.tools.build:gradle:8.0.2") // Use the appropriate version
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0") // Use the appropriate version
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    id("com.google.gms.google-services") version "4.4.1" apply false
}
