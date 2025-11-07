plugins {
    alias(libs.plugins.example.android.library)
    alias(libs.plugins.example.jvm.ktor)
}

android {
    namespace = "com.example.run.network"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.data)
}