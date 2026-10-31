plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.recipe"

    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.example.recipe"

        minSdk = 26
        targetSdk = 37

        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    // AndroidX AppCompat
    implementation(libs.appcompat)

    // Material Design
    implementation(libs.material)

    // RecyclerView
    implementation("androidx.recyclerview:recyclerview:1.4.0")

    // ConstraintLayout
    implementation(libs.constraintlayout)

    // Glide - safely loads and resizes images
    implementation("com.github.bumptech.glide:glide:4.16.0")

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}