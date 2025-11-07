plugins {
    alias(libs.plugins.example.android.library)
}

android {
    namespace = "com.example.core.data"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.database)
    implementation(libs.timber)
}