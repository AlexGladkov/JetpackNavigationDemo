dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter() // Warning: this repository is going to shut down soon
    }
}
rootProject.name = "JetpackNavigationDemo"
include(":app")
include(":feature-main")
include(":feature-login")
include(":feature-detail")
include(":utils")
