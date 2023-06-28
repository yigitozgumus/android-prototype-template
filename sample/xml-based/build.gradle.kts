@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
  alias(libs.plugins.androidApplication)
  alias(libs.plugins.kotlinAndroid)
  kotlin("kapt")
  alias(libs.plugins.hilt)
}

android {
  namespace = "com.yigitozgumus.xml_based"
  compileSdk = 33

  defaultConfig {
	applicationId = "com.yigitozgumus.xml_based"
	minSdk = 24
	targetSdk = 33
	versionCode = 1
	versionName = "1.0"

	testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

  implementation(project(":prototype"))

  implementation(libs.core.ktx)
  implementation(libs.appcompat)
  implementation(libs.material)
  implementation(libs.constraintlayout)
  testImplementation(libs.junit)
  implementation(libs.hilt)
  kapt(libs.hilt.compiler)
  androidTestImplementation(libs.androidx.test.ext.junit)
  androidTestImplementation(libs.espresso.core)
}