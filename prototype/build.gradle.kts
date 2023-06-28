@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
  alias(libs.plugins.androidLibrary)
  alias(libs.plugins.kotlinAndroid)
  kotlin("kapt")
  alias(libs.plugins.hilt)
}

android {
  namespace = "com.yigitozgumus.experiment"
  compileSdk = 33

  defaultConfig {
	minSdk = 24

	testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
	consumerProguardFiles("consumer-rules.pro")
  }

  buildFeatures {
	compose = true
  }
  composeOptions {
	kotlinCompilerExtensionVersion = "1.4.3"
  }
  buildTypes {
	release {
	  isMinifyEnabled = false
	  proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
	}
  }
  compileOptions {
	sourceCompatibility = JavaVersion.VERSION_17
	targetCompatibility = JavaVersion.VERSION_17
  }
  kotlinOptions {
	jvmTarget = "17"
  }
}

dependencies {

  // Compose
  implementation(libs.core.ktx)
  implementation(libs.lifecycle.runtime.ktx)
  implementation(libs.activity.compose)
  implementation(platform(libs.compose.bom))
  implementation(libs.ui)
  implementation(libs.ui.graphics)
  implementation(libs.ui.tooling.preview)
  implementation(libs.material3)
  // XML based
  implementation(libs.appcompat)
  implementation(libs.material)
  implementation(libs.recyclerview)
  implementation(libs.viewmodel)
  implementation(libs.savedstate)
  implementation(libs.lifecycle.runtime)
  implementation(libs.hilt)
  implementation(libs.activity.ktx)
  kapt(libs.hilt.compiler)

  testImplementation(libs.junit)
  androidTestImplementation(libs.androidx.test.ext.junit)
  androidTestImplementation(platform(libs.compose.bom))
  androidTestImplementation(libs.espresso.core)
}