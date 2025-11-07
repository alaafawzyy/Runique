plugins {
    alias(libs.plugins.example.jvm.library)
    alias(libs.plugins.example.jvm.ktor)
}
dependencies{
    implementation(libs.kotlinx.coroutines.core)
}