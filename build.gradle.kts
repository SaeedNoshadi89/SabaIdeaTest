buildscript {
    dependencies {
        classpath(Dependencies.hilt_plugin)
        classpath(Dependencies.kotlin_serialization)
    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.2.1" apply false
    id ("com.android.library") version "7.2.1" apply false
    id("org.jetbrains.kotlin.jvm") version "1.6.21" apply false // or kotlin("multiplatform") or any other kotlin plugin
    id("org.jetbrains.kotlin.plugin.serialization") version "1.6.21" apply false
}