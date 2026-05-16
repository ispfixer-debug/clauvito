// Top-level build file for Vito platform
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.hilt) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.serialization) apply false
    alias(libs.plugins.realtime) apply false
    alias(libs.plugins.play.publisher) apply false
    alias(libs.plugins.about.libraries) apply false
}

// Version catalog consumed by all modules
tasks.register("dependencies") {
    doLast {
        println("\n=== Vito Dependency Tree ===")
        println("AGP: ${libs.versions.agp.get()}")
        println("Kotlin: ${libs.versions.kotlin.get()}")
        println("Compose BOM: ${libs.versions.compose.bom.get()}")
        println("Hilt: ${libs.versions.hilt.get()}")
        println("Room: ${libs.versions.room.get()}")
        println("Supabase: ${libs.versions.supabase.get()}")
        println("Stripe: ${libs.versions.stripe.get()}")
        println("Firebase: ${libs.versions.firebase.get()}")
    }
}