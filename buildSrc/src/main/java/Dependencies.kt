import Versions.android_coroutines_version
import Versions.compose_activity_version
import Versions.compose_coil_version
import Versions.compose_material_version
import Versions.compose_version
import Versions.core_version
import Versions.coroutines_test_version
import Versions.espresso_version
import Versions.hilt_navigation_compose_version
import Versions.hilt_plugin_version
import Versions.junit_version
import Versions.kotlin_serialization_json_version
import Versions.kotlin_version
import Versions.ktor_version
import Versions.lifecycle_version
import Versions.text_junit_version
import Versions.timber_version
import Versions.truth_version
import Versions.turbine_version

object Dependencies {
	const val core = "androidx.core:core-ktx:$core_version"
	const val kotlin_reflection = "org.jetbrains.kotlin:kotlin-reflect:$kotlin_version"
	const val compose_ui = "androidx.compose.ui:ui:$compose_version"
	const val compose_material = "androidx.compose.material3:material3:$compose_material_version"
	const val compose_tooling = "androidx.compose.ui:ui-tooling-preview:$compose_version"
	const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version"
	const val compose_activity = "androidx.activity:activity-compose:$compose_activity_version"
	const val junit = "junit:junit:$junit_version"
	const val text_junit = "androidx.test.ext:junit:$text_junit_version"
	const val espresso = "androidx.test.espresso:espresso-core:$espresso_version"
	const val compose_ui_test = "androidx.compose.ui:ui-test-junit4:$compose_version"
	const val compose_ui_tooling = "androidx.compose.ui:ui-tooling:$compose_version"
	const val compose_test_manifest = "androidx.compose.ui:ui-test-manifest:$compose_version"

	const val hilt_plugin = "com.google.dagger:hilt-android-gradle-plugin:$hilt_plugin_version"
	const val hilt_android = "com.google.dagger:hilt-android:$hilt_plugin_version"
	const val hilt_compiler = "com.google.dagger:hilt-android-compiler:$hilt_plugin_version"
	const val hilt_navigation_compose =
		"androidx.hilt:hilt-navigation-compose:$hilt_navigation_compose_version"
	const val kotlin_serialization = "org.jetbrains.kotlin:kotlin-serialization:$kotlin_version"
	const val kotlin_serialization_json =
		"org.jetbrains.kotlinx:kotlinx-serialization-json:$kotlin_serialization_json_version"
	const val ktor_client_core = "io.ktor:ktor-client-core:$ktor_version"
	const val ktor_client_cio = "io.ktor:ktor-client-cio:$ktor_version"
	const val ktor_serialization_json = "io.ktor:ktor-serialization-kotlinx-json:$ktor_version"
	const val ktor_serialization = "io.ktor:ktor-client-serialization:$ktor_version"
	const val ktor_android = "io.ktor:ktor-client-android:$ktor_version"
	const val ktor_negotiation = "io.ktor:ktor-client-content-negotiation:$ktor_version"
	const val ktor_okhttp = "io.ktor:ktor-client-okhttp:$ktor_version"
	const val ktor_logging = "io.ktor:ktor-client-logging:$ktor_version"
	const val android_coroutines =
		"org.jetbrains.kotlinx:kotlinx-coroutines-android:$android_coroutines_version"
	const val compose_viewmodel =
		"androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycle_version"
	const val compose_material_icons =
		"androidx.compose.material:material-icons-extended:$compose_version"
	const val compose_coil = "io.coil-kt:coil-compose:$compose_coil_version"
	const val timber = "com.jakewharton.timber:timber:$timber_version"
	const val truth = "com.google.truth:truth:$truth_version"
	const val turbine = "app.cash.turbine:turbine:$turbine_version"
	const val coroutine_test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutines_test_version"


}

object Versions {
	const val kotlin_version = "1.6.21"
	const val android_coroutines_version = "1.3.9"
	const val compose_version = "1.2.0-rc02"
	const val compose_coil_version = "2.1.0"
	const val core_version = "1.7.0"
	const val compose_material_version = "1.0.0-alpha14"
	const val lifecycle_version = "2.5.0-rc01"
	const val compose_activity_version = "1.3.1"
	const val junit_version = "4.13.2"
	const val text_junit_version = "1.1.3"
	const val espresso_version = "3.4.0"
	const val hilt_plugin_version = "2.42"
	const val hilt_navigation_compose_version = "1.0.0"
	const val ktor_version = "2.0.3"
	const val kotlin_serialization_json_version = "1.3.3"
	const val timber_version = "5.0.1"
	const val truth_version = "1.1.3"
	const val turbine_version = "0.8.0"
	const val coroutines_test_version = "1.6.3"
}

object AppDetail {
	const val applicationId = "com.sn.sabaideatest"
	const val appName = "SabaMovies"
	const val compileSdk = 32
	const val minSdk = 23
	const val targetSdk = 32
	const val versionCode = 1
	const val versionName = "1.0.0"
}