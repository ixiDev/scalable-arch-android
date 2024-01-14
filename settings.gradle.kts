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

rootProject.name = "scalable-arch-android"
include(":app")
include(":ui")
include(":ui:common")
include(":ui:home")
include(":ui:featureone")
include(":ui:featuretwo")
include(":domain")
include(":data")
