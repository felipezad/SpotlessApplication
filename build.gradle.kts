// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.spotless) apply true
}

configure<com.diffplug.gradle.spotless.SpotlessExtension> {
    ratchetFrom("origin/main")
    kotlin {
        target("**/src/**/*.kt")
        targetExclude("**/build/**/*.kt", "**/generated/**/*.kt")
        ktlint("1.3.1")
            .setEditorConfigPath("$projectDir/.editorconfig")
    }
    format("kts") {
        target("**/src/**/*.kts")
        targetExclude("**/build/**/*.kts", "**/generated/**/*.kts")
    }
}
