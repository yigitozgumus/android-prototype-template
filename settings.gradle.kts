pluginManagement {
  repositories {
	google()
	mavenCentral()
	gradlePluginPortal()
  }
}
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
	google()
	mavenCentral()
  }
}

rootProject.name = "prototype-template"
include(":app")
include(":prototype")
include(":sample:compose")
include(":sample:xml-based")
