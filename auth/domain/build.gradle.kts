plugins {
   alias(libs.plugins.example.jvm.library)
}

dependencies{
    implementation(projects.core.domain)
}
