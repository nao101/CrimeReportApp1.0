// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    // 🔧 You must add this manually with a version
    id("com.google.gms.google-services") version "4.4.1" apply false
}

