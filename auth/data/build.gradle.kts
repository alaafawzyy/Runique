plugins {
    alias(libs.plugins.example.android.library)
    alias(libs.plugins.example.jvm.ktor)
}

android {
    namespace = "com.example.auth.data"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
    implementation(projects.core.data)
}