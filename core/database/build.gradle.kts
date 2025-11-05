plugins {
    alias(libs.plugins.example.android.library)
    alias(libs.plugins.example.android.room)
}

android {
    namespace = "com.example.core.database"
}

dependencies {
    implementation(projects.core.domain)

    implementation(libs.org.mongodb.bson)
}