plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("com.google.gms.google-services") version "4.4.1"
    id("org.jetbrains.kotlin.plugin.parcelize")
    id("org.jetbrains.kotlin.kapt")
}

android {
    namespace = "mnxk.mcommerce.shopapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "mnxk.mcommerce.shopapp"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    // Firebase
    implementation(platform("com.google.firebase:firebase-bom:32.7.4"))
    implementation("com.google.firebase:firebase-analytics")
    // Loading button
    implementation("br.com.simplepass:loading-button-android:2.2.0")
    // Circle image view
    implementation("de.hdodenhof:circleimageview:3.1.0")
    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    // viewpager2 indicator
    implementation("com.tbuonomo.andrui:viewpagerdotsindicator:4.1.2")
    implementation("io.github.vejei.viewpagerindicator:viewpagerindicator:1.0.0-alpha.1")
    // stepView
    implementation("com.shuhart.stepview:stepview:1.5.1")
    // Android KTX
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
    // Dagger-Hilt
    implementation("com.google.dagger:hilt-android:2.40.5")
    apply(plugin = "kotlin-kapt")
    kapt("com.google.dagger:hilt-compiler:2.40.5")
    // Kotlin
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
