plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
    kotlin("plugin.serialization")
}

android {
    compileSdk = AppDetail.compileSdk

    defaultConfig {
        applicationId = AppDetail.applicationId
        minSdk = AppDetail.minSdk
        targetSdk = AppDetail.targetSdk
        versionCode = AppDetail.versionCode
        versionName = AppDetail.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose_version
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Dependencies.core)
    implementation(Dependencies.kotlin_reflection)
    implementation(Dependencies.timber)
    implementation(Dependencies.compose_ui)
    implementation(Dependencies.compose_material)
    implementation(Dependencies.compose_tooling)
    implementation(Dependencies.lifecycle)
    implementation(Dependencies.compose_activity)
    implementation(Dependencies.compose_material_icons)
    implementation(Dependencies.compose_viewmodel)
    implementation(Dependencies.compose_coil)
    implementation(Dependencies.android_coroutines)
    implementation(Dependencies.ktor_android)
    implementation(Dependencies.ktor_client_cio)
    implementation(Dependencies.ktor_logging)
    implementation(Dependencies.ktor_okhttp)
    implementation(Dependencies.ktor_negotiation)
    implementation(Dependencies.ktor_serialization)
    implementation(Dependencies.ktor_serialization_json)
    implementation(Dependencies.ktor_client_core)
    implementation(Dependencies.hilt_navigation_compose)
    implementation(Dependencies.hilt_android)
    kapt(Dependencies.hilt_compiler)
    implementation(Dependencies.kotlin_serialization_json)
    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.text_junit)
    androidTestImplementation(Dependencies.espresso)
    androidTestImplementation(Dependencies.compose_ui_test)
    debugImplementation(Dependencies.compose_ui_tooling)
    debugImplementation(Dependencies.compose_test_manifest)

}