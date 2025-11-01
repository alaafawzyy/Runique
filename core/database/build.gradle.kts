plugins {
    alias(libs.plugins.example.android.library)
}

android {
    namespace = "com.example.core.database"
}

dependencies {
    implementation(projects.core.domain)

    implementation(libs.org.mongodb.bson)
}