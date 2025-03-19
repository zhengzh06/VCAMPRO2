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
        gradlePluginPortal()
        mavenCentral()
        maven("https://api.xposed.info/")
        maven ("https://maven.pkg.github.com/GCX-HCI/tray" )
        maven { url "https://maven.aliyun.com/repository/public" }
    }
}

rootProject.name = "VCAMSX"
include(":app")
 
