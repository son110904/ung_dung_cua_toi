pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "ung dung cua toi"
include(":app")
include(":app:clock")
include(":app:clock:chuyendoidonvi")
include(":app:clock:calculator")
include(":app:calculator")
include(":app:expensify")
include(":app:note")
include(":app:tracnghiem")
include(":app:vocab")
